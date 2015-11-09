import CodeGen.CodeGenerator;
import SemanticAnalysis.SemanticWarnings;
import Utilities.DescriptiveErrorListener;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.awt.*;
import java.io.*;

public class GUIMenu {

    double height = 350;
    double width = 800;
    private String FOLDER;

    FileChooser fileChooser = new FileChooser();

    private boolean canGenerate = false;
    private boolean thereBeWarnings = false;
    private boolean CMDprint = false;

    TextArea output = new TextArea();

    private File inputFile = null;
    String inputFileName;
    String outputFilename;
    String iFNNoExt;
    String workDirectory = System.getProperty("user.dir");

    public GUIMenu(File inputFile, String inputFileName, String iFNNoExt){
        this.inputFileName = inputFileName;
        this.iFNNoExt = iFNNoExt;
        this.outputFilename = iFNNoExt + "DOT.txt";
        this.inputFile = inputFile;
        this.FOLDER = JSONRun.FOLDER;
        CMDprint = true;
    }

    public GUIMenu(){

    }

    public HBox Menu(Stage stage, Scene scene) {

        this.FOLDER = JSONRun.FOLDER;

        scene.widthProperty().addListener((observableValue, oldSceneWidth, newSceneWidth) -> {
            width = newSceneWidth.doubleValue();
            stage.setTitle("JSON2DOT -- " + width + "x" + height);
            output.setPrefSize(width, height);
        });
        scene.heightProperty().addListener((observableValue, oldSceneHeight, newSceneHeight) -> {
            height = newSceneHeight.doubleValue();
            stage.setTitle("JSON2DOT -- " + width + "x" + height);
            output.setPrefSize(width, height);
        });

        HBox hbox = new HBox(5);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(10, 0, 10, 0));

        Button loadJson = new Button("Load");
        loadJson.setPrefSize(90, 20);
        loadJson.setOnAction(e -> {
            fileChooser.setInitialDirectory(new File(workDirectory + "\\" + FOLDER));
            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
            fileChooser.getExtensionFilters().add(extFilter);
            inputFile = fileChooser.showOpenDialog(stage);
            if (inputFile != null) {
                inputFileName = inputFile.getName();
                iFNNoExt = inputFileName.substring(0, inputFileName.length() - 4);
                print("\nLoaded file " + inputFileName);
            }
        });

        Button reload = new Button("Reload");
        reload.setPrefSize(90, 20);
        reload.setOnAction(e -> {
            if(inputFile != null) {
                inputFile = new File(workDirectory + "\\" + FOLDER + "\\" + inputFileName);
                print("\n" + inputFileName + " Reloaded");
                canGenerate = false;
            } else {
                print("No file Loaded");
            }
        });

        Button run = new Button("Run");
        run.setPrefSize(90, 20);
        run.setOnAction(e -> run());

        Button makeImage = new Button("Make PNG");
        makeImage.setPrefSize(90, 20);
        makeImage.setOnAction(e -> {
            if (!canGenerate) {
                print("\nCannot make PNG, DOT file not generated.");
            } else {
                Dot2Png();
            }
        });

        Button quit = new Button("Quit");
        quit.setPrefSize(90, 20);
        quit.setOnAction(e -> System.exit(0));

        hbox.getChildren().addAll(loadJson, reload, run, makeImage, quit);

        return hbox;
    }

    public HBox Output(){

        HBox hbox = new HBox();
        hbox.setPadding(new Insets(0, 10, 10, 10));

        output.setPrefSize(width, height);
        output.setFont(new javafx.scene.text.Font("Helvetica", 15));
        output.editableProperty().set(false);
        hbox.getChildren().add(output);

        print("Working Directory:\n" + workDirectory + "");

        return hbox;
    }

    public void run() {
        canGenerate = false;
        thereBeWarnings = false;
        if (inputFile != null) {
            outputFilename = workDirectory + "\\" + FOLDER + "\\" + iFNNoExt + "2DOT.txt";
        } else {
            if(!CMDprint) {
                print("\nNo file loaded");
            } else {
                System.out.println("\nNo file loaded");
            }
            return;
        }

        JSONLexer lexer = lexicalAnalysis();
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ParseTree tree = syntacticAnalysis(tokens);
        if (tree == null) return;

        SemanticAnalyzer listener = semanticAnalysis(tree);
        if(listener == null) return;

        codeGeneration(listener);
    }


    private JSONLexer lexicalAnalysis(){
        InputStream is;
        ANTLRInputStream in = null;
        try {
            is = new FileInputStream(inputFile);
            in = new ANTLRInputStream(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONLexer lexer = new JSONLexer(in);
        lexer.removeErrorListeners();
        DescriptiveErrorListener lexerCollector = DescriptiveErrorListener.INSTANCE;
        lexer.addErrorListener(lexerCollector);

        return lexer;
    }

    private ParseTree syntacticAnalysis(CommonTokenStream tokens) {
        JSONParser parser = new JSONParser(tokens);
        parser.removeErrorListeners();
        DescriptiveErrorListener parserCollector = DescriptiveErrorListener.INSTANCE;
        parser.addErrorListener(parserCollector);

        ParseTree tree = parser.start();

        if (parserCollector.getErrors().size() > 0) {
            if(!CMDprint) {
                print("\n--- Error(s) ---");
                parserCollector.getErrors().forEach(this::print);
                print("\n");
            } else {
                CMDErrorPrint("\n--- Error(s) ---");
                parserCollector.getErrors().forEach(this::CMDErrorPrint);
                CMDPrint("\n");
            }
            DescriptiveErrorListener.INSTANCE.getErrors().clear();
            return null;
        } else {
            return tree;
        }
    }

    private SemanticAnalyzer semanticAnalysis(ParseTree tree) {
        boolean isNull = false;
        ParseTreeWalker walker = new ParseTreeWalker();
        SemanticAnalyzer listener = new SemanticAnalyzer();

        walker.walk(listener, tree);

        if (listener.errors.size() > 0) {
            if(!CMDprint) {
                print("\n --- Error(s) ---");
                listener.errors.forEach(this::print);
            } else {
                CMDErrorPrint("\n --- Error(s) ---");
                listener.errors.forEach(this::CMDErrorPrint);
            }
            isNull = true;
        }

        SemanticWarnings sw = new SemanticWarnings(listener.nodes, listener.links, listener.groups,
                listener.nodeMap, listener.linkMap, listener.groupMap);
        sw.run();
        if (sw.warnings.size() > 0) {
            if(!CMDprint) {
                print("\n --- Warning(s) ---");
                sw.warnings.forEach(this::print);
            } else {
                CMDPrint("\n --- Warning(s) ---");
                sw.warnings.forEach(this::CMDPrint);
            }
            thereBeWarnings = true;
        }

        if(isNull) return null;
        else return listener;
    }

    private void codeGeneration(SemanticAnalyzer listener){
        CodeGenerator codeGenerator = new CodeGenerator(listener.nodes,
                listener.links,
                listener.groups,
                outputFilename);

        codeGenerator.generateCode();

        if(!thereBeWarnings) {
            if(!CMDprint) {
                print("\n" + iFNNoExt + "2DOT.txt Created Successfully");
            } else {
                CMDPrint("\n" + iFNNoExt + "2DOT.txt Created Successfully");
            }
        } else {
            if(!CMDprint) {
                print("\n" + iFNNoExt + "2DOT.txt Created with Warnings");
            } else {
                CMDPrint("\n" + iFNNoExt + "2DOT.txt Created with Warnings");
            }
        }
        canGenerate = true;
        thereBeWarnings = false;
    }

    private void Dot2Png(){
        String command = "dot " +  workDirectory + "\\" + FOLDER + "\\" +  iFNNoExt + "2DOT.txt -Tpng -o " + workDirectory + "\\" + FOLDER + "\\" +  iFNNoExt + ".png";
        try {
            print("\nCreating PNG file");
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", command);
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while (true) {
                line = r.readLine();
                if (line == null) { break; }
                print(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(!CMDprint) {
            print("\nPNG File Created Successfully");
        } else {
            CMDPrint("\nPNG File Created Successfully");
        }
        try {
            Desktop.getDesktop().open(new File(workDirectory + "\\" + FOLDER + "\\" + iFNNoExt + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void print(String str){
        output.appendText(str + "\n");
    }

    void CMDPrint(String str){
        System.out.println(str);
    }

    void CMDErrorPrint(String err){
        System.err.println(err);
    }
}


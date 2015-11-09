import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.File;

public class JSONRun extends Application {

    double height = 350;
    double width = 800;
    public static final String FOLDER = "examples";

    private static GUIMenu guiMenu;


    static private File inputFile = null;
    static String inputFileName;
    static String iFNNoExt;
    static String workDirectory = System.getProperty("user.dir");


    public static void main(String args[]) {
        if (args.length > 0) {
            inputFileName = args[0].trim();
            inputFile = new File(workDirectory + "\\" + FOLDER + "\\" + inputFileName);
            iFNNoExt = inputFileName.substring(0, inputFileName.length() - 4);
            guiMenu = new GUIMenu(inputFile, inputFileName, iFNNoExt);
            System.out.println("RUNNING...");
            guiMenu.run();
        } else {
            launch(JSONRun.class, args);
        }
        System.exit(0);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane border = new BorderPane();

        guiMenu = new GUIMenu();

        Scene scene = new Scene(border, width, height);

        HBox menu = guiMenu.Menu(stage, scene);
        border.setTop(menu);

        HBox out = guiMenu.Output();
        border.setCenter(out);

        stage.setScene(scene);
        stage.setTitle("JSON2DOT -- " + width + "x" + height);
        stage.show();
    }
}








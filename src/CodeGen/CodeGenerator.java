package CodeGen;

import InterRep.Attribute;
import InterRep.Group;
import InterRep.Link;
import InterRep.Node;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CodeGenerator {

    String TAB = "    ";

    ArrayList<Node> nodes = new ArrayList<Node>();
    ArrayList<Link> links = new ArrayList<Link>();
    ArrayList<Group> groups = new ArrayList<>();
    PrintWriter pw;

    public CodeGenerator(ArrayList<Node> nodes, ArrayList<Link> links, ArrayList<Group> groups, String filename){
        this.nodes = nodes;
        this.links = links;
        this.groups = groups;
        File file = new File(filename);
        try {
            this.pw = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void generateCode(){
        this.writeHeader();
        this.newLine(1);
        this.writeClusters();
        this.writeNonClusterLinks();
        this.writeCloser();
    }

    public void writeHeader(){
        this.pw.write("digraph G {\n");
        this.writeTab(1);
        this.pw.write("compound = true;\n");
    }

    public void writeCloser(){
        this.pw.write("}");
        this.pw.close();
    }

    public void writeClusters(){
        Group gg = getG(0);
        if(gg != null ){
            writeGeneralAttributes(gg);
        }
        for(Group g : groups) {
            if(g.getId() != 0 && g.nodes.size() > 0) {
                this.pw.write(groupToDOT(g));
            }
        }
    }

    public void writeNonClusterLinks(){
        for(Link link : this.links){
            if(link.getSource().getGroup() != link.getTarget().getGroup()){
                this.writeTab(1);
                this.pw.write(LinkToString(link));
            }
        }
    }

    private void writeGeneralAttributes(Group gg){
        writeTab(1);
        for(Attribute att : gg.attributes){
            pw.write(AttToString(att));
        }
        newLine(2);
    }

    public void writeTab(int i){
        for(int k = 0; k < i; k++) {
            this.pw.write("    ");
        }
    }

    public void newLine(int i){
        for(int k = 0; k < i; k++){
            this.pw.write("\n");
        }
    }

    private Group getG(int g){
        for(Group gr : groups){
            if(g == gr.getId()){
                return gr;
            }
        }
        return null;
    }

    private String groupToDOT(Group g){
        return TAB + "subgraph cluster" + g.getId() + "{\n" +
                printGroupAttributes(g) +
                printGroupNodes(g) +
                printGroupLinks(g) +
                TAB + "}\n\n";
    }

    private String printGroupAttributes(Group g){
        String str = TAB + TAB;
        for(int i = 0; i < g.attributes.size(); i++){
            Attribute att = g.attributes.get(i);
            str += att.getName() + "=" + att.getStrValue();
            if(i != g.attributes.size()-1){
                str += "; ";
            }
        }
        if(!str.equals(TAB + TAB)) {
            return str + ";\n";
        }
        return "";
    }

    String printGroupNodes(Group g){
        String str = "";
        for(Node n : g.nodes){
            str = str + TAB + TAB + NodeToString(n);
        }
        return str;
    }

    String printGroupLinks(Group g){
        String str = "";
        for(Link l : g.links){
            str = str + TAB + TAB + LinkToString(l);
        }
        return str;
    }

    private String NodeToString(Node n){
        return n.getName() + "[" + printNodeAttributes(n) + "];\n";
    }

    private String printNodeAttributes(Node n){
        String str = "";
        for(int i = 0; i < n.attributes.size(); i++){
            Attribute att = n.attributes.get(i);
            str += att.getName() + "=" + att.getStrValue();
            if(i != n.attributes.size()-1){
                str += ", ";
            }
        }
        return str;
    }

    private String LinkToString(Link l){
        return l.getSource().getName() + " -> " + l.getTarget().getName() + "[" + printLinkAttributes(l) + "];\n";
    }

    private String printLinkAttributes(Link l){
        String str = "";
        for(int i = 0; i < l.attributes.size(); i++){
            Attribute att = l.attributes.get(i);
            str += att.getName() + "=" + att.getStrValue();
            if(i != l.attributes.size()-1){
                str += ", ";
            }
        }
        return str;
    }

    private String AttToString(Attribute att){
        return att.getName() + "="  + att.getStrValue() + "; ";

    }
}

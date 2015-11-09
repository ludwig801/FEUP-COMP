import InterRep.Attribute;
import InterRep.Group;
import InterRep.Link;
import InterRep.Node;
import Utilities.InvalidValueException;
import Utilities.Pair;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SemanticAnalyzer extends JSONBaseListener implements ParseTreeListener {
    public ArrayList<Node> nodes = new ArrayList<Node>();
    public ArrayList<Link> links = new ArrayList<Link>();
    public ArrayList<Group> groups = new ArrayList<>();
    public List<String> errors = new ArrayList<>();
    public HashMap<Integer, Pair<Integer, Integer>> linkMap = new HashMap<>();
    public HashMap<Integer, Pair<Integer, Integer>> groupMap = new HashMap<>();
    public HashMap<Integer, Pair<Integer, Integer>> nodeMap = new HashMap<>();

    public int nnodes = 0;
    public int nlinks = 0;
    public int currentG;

    private boolean repeatedNodeName = false;

    public SemanticAnalyzer(){
        nodes.clear();
        links.clear();
        groups.clear();
        errors.clear();
        linkMap.clear();
        groupMap.clear();
        nodeMap.clear();
        nnodes = 0;
        nlinks = 0;
        Node.id_count = 0;
        Link.id_count = 0;
    }

    @Override public void enterNode(@NotNull JSONParser.NodeContext ctx) {
        String node_name = ctx.NAME().getText();
        int group = new Integer(Integer.parseInt(ctx.group.getText()));

        repeatedNodeName = repeatedNodeName(node_name, ctx);

        if(!repeatedNodeName) {
            Node n = new Node(node_name, group);
            nodes.add(n);
            nodeMap.put(n.getId(), new Pair(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
            Group g = new Group(group);
            if (!groups.contains(g)) {
                groups.add(g);
            }
            getG(group).nodes.add(n);
        } else {
            Node.id_count++;
            nnodes--;
        }
    }

    @Override public void exitNode(@NotNull JSONParser.NodeContext ctx){
        nnodes++;
        repeatedNodeName = false;
    }

    @Override public void enterNodeAttr(@NotNull JSONParser.NodeAttrContext ctx){
        String name = ctx.name.getText();
        String value = ctx.value.getText();

        try {
            validateNodeAttribute(name, value, ctx);
            if(!repeatedNodeName) {
                nodes.get(nnodes).attributes.add(new Attribute(name.toLowerCase(), value));
            }
        } catch (InvalidValueException e){
            this.errors.add(e.getMessage());
        }
    }

    @Override public void enterLink(@NotNull JSONParser.LinkContext ctx){

        Object source;
        try{
            source = Integer.parseInt(ctx.source.getText());

        } catch(NumberFormatException e){
            source = ctx.source.getText();
        }

        Object target;
        try{
            target = Integer.parseInt(ctx.target.getText());
        } catch(NumberFormatException e){
            target = ctx.target.getText();
        }

        int value = Integer.parseInt(ctx.value.getText());

        Link l = new Link(source, target, value);

        links.add(l);

        linkMap.put(l.getId(), new Pair(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
    }

    @Override public void exitLink(@NotNull JSONParser.LinkContext ctx){
        nlinks++;
    }

    @Override public void enterLinkAttr(@NotNull JSONParser.LinkAttrContext ctx) {
        String name = ctx.name.getText();
        String value = ctx.value.getText();

        try {
            validateLinkAttribute(name, value, ctx);
            Attribute attr = new Attribute(name.toLowerCase(), value);
            links.get(nlinks).attributes.add(attr);
        } catch (InvalidValueException e) {
            this.errors.add(e.getMessage());
        }
    }

    @Override public void enterGroupOption(@NotNull JSONParser.GroupOptionContext ctx) {
        currentG = Integer.parseInt(ctx.group.getText());

        Group g = new Group(currentG);

        if(!groups.contains(g)) {
            groups.add(new Group(currentG));
        }
        groupMap.put(currentG, new Pair(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
    }

    @Override public void enterGroupAttr(@NotNull JSONParser.GroupAttrContext ctx) {
        String name = ctx.name.getText();
        String value = ctx.value.getText();

        try {
            validateGroupAttribute(name, value, ctx);
            getG(currentG).attributes.add(new Attribute(name, value));
        } catch (InvalidValueException e){
           this.errors.add(e.getMessage());
        }
    }

   @Override public void exitStart(@NotNull JSONParser.StartContext ctx){
       processGroups();
       processLinks();
   }

    public void validateNodeAttribute(String name, String value, JSONParser.NodeAttrContext ctx) throws InvalidValueException{
        for(AttributeList.NodeAttributes att : AttributeList.NodeAttributes.values()){
            if(att.name().equalsIgnoreCase(name)){
                att.validate(value, ctx);
                return;
            }
        }
        throw new InvalidValueException("Invalid node attribute name --  " + name + "  -- Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
    }

    public void validateLinkAttribute(String name, String value, JSONParser.LinkAttrContext ctx) throws InvalidValueException{
        for(AttributeList.LinkAttributes att : AttributeList.LinkAttributes.values()){
            if(att.name().equalsIgnoreCase(name)){
                att.validate(value, ctx);
                return;
            }
        }
        throw new InvalidValueException("Invalid link attribute name --  " + name + "  --. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
    }

    public void validateGroupAttribute(String name, String value, @NotNull JSONParser.GroupAttrContext ctx)throws InvalidValueException{
        for(AttributeList.GroupAttributes att :AttributeList. GroupAttributes.values()){
            if(att.name().equalsIgnoreCase(name)){
                att.validate(value, ctx);
                return;
            }
        }
        throw new InvalidValueException("Invalid group attribute name --  " + name + "  -- Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
    }

    private boolean repeatedNodeName(String name, @NotNull JSONParser.NodeContext ctx){
        for(Node n : nodes){
            if (name.equals(n.getName())){
                errors.add("Repeated Node name detected: " + name + " Line: " + ctx.getStart().getLine() + " Position: " + ctx.getStart().getCharPositionInLine());
                return true;
            }
        }
        return false;
    }

    private Group getG(int g){
        for(Group gr : groups){
            if(g == gr.getId()){
                return gr;
            }
        }
        return null;
    }

    private Node getNode(Object identifier){
        if(identifier instanceof String){
            return getNode((String)identifier);
        } else if(identifier instanceof Integer){
            return getNode((Integer) identifier);
        } else return null;
    }

    private Node getNode(String name){
        for(Node n : nodes){
            if(n.getName().equals(name)){
                return n;
            }
        }
        return null;
    }

    private Node getNode(Integer id){
        for(Node n : nodes){
            if(n.getId() == id){
                return n;
            }
        }
        return null;
    }

    private void processLinks(){
        if(links.size() == 0){
            errors.add("No links detected");
            return;
        }
        for(Link l : links){
           Pair ctx = linkMap.get(l.getId());

            Node source = getNode(l.getTempSource());
           if(source == null){
               if(l.getTempSource() instanceof String){
                   errors.add("Node " + l.getTempSource() + " does not exist. Line: " + ctx.getFirst() + " Position: " + ctx.getSecond());
               } else if(l.getTempSource() instanceof Integer){
                   errors.add("Node with ID " + l.getTempSource() + " does not exist. Line: " + ctx.getFirst() + " Position: " + ctx.getSecond());
               }
           } else {
               l.setSource(source);
           }

            Node target = getNode(l.getTempTarget());
            if(target == null){
               if(l.getTempTarget() instanceof String){
                   errors.add("Node " + l.getTempTarget() + " does not exist. Line: " + ctx.getFirst() + " Position: " + ctx.getSecond());
               } else if(l.getTempTarget() instanceof Integer){
                   errors.add("Node with ID " + l.getTempTarget() + " does not exist. Line: " + ctx.getFirst()  + " Position: " + ctx.getSecond());
               }
           } else {
               l.setTarget(target);
           }

           if(source != null && target != null){
               if(source == target){
                   errors.add("Source and Target cannot be the same. Line: " + ctx.getFirst()  + " Position: " + ctx.getSecond());
               } else if(source.getGroup() == target.getGroup()){
                   getG(source.getGroup()).links.add(l);
               }
           }
        }
    }

    void processGroups(){
        for(Group g : groups){
            if(g.nodes.size() == 0 && g.getId() != 0){ // group was created but there is no nodes for it
                Pair ctx = groupMap.get(g.getId());
                errors.add("Group " + g.getId() + " is defined but has no nodes. Line: " + ctx.getFirst() + " Position: " + ctx.getSecond());
            }
        }
    }
}

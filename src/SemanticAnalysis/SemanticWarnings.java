package SemanticAnalysis;

import InterRep.Attribute;
import InterRep.Group;
import InterRep.Link;
import InterRep.Node;
import Utilities.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SemanticWarnings {

    public ArrayList<Node> nodes = new ArrayList<Node>();
    public ArrayList<Link> links = new ArrayList<Link>();
    public ArrayList<Group> groups = new ArrayList<>();
    public List<String> warnings = new ArrayList<>();
    public HashMap<Integer, Pair<Integer, Integer>> linkMap;
    public HashMap<Integer, Pair<Integer, Integer>> groupMap;
    public HashMap<Integer, Pair<Integer, Integer>> nodeMap;

    public SemanticWarnings(ArrayList<Node> nodes,
                            ArrayList<Link> links,
                            ArrayList<Group> groups,
                            HashMap<Integer, Pair<Integer, Integer>> nodeMap,
                            HashMap<Integer, Pair<Integer, Integer>> linkMap,
                            HashMap<Integer, Pair<Integer, Integer>> groupMap){
        this.nodes = nodes;
        this.links = links;
        this.groups = groups;
        this.linkMap = linkMap;
        this.groupMap = groupMap;
        this.nodeMap = nodeMap;

    }

    public void run(){
        nodeWarnings();
        linkWarnings();
        groupWarnings();
    }

    public void nodeWarnings(){
        for(Node n : nodes){
            nodeRepeatedAttributes(n);
            additionalNodeChecks(n);
            clearLastNodeVars();
        }
    }


    public void linkWarnings(){
        for(Link l : links) {
            linkRepeatedAttributes(l);
            additionalLinkChecks(l);
            clearLastLinkVars();
        }
    }

    public void groupWarnings(){
        for(Group g : groups){
            if(g.nodes.size() > 0) {
                groupRepeatedAttributes(g);
                additionalGroupChecks(g);
                clearGroupVars();
            }
        }
    }

    private void nodeRepeatedAttributes(Node n){
        for(Attribute att : n.attributes){
            Pair ctx = nodeMap.get(n.getId());
            if(repeatedAttr(att.getName(), n.attributes)){
                String war = "Node " + n.getName() + " has multiple " + att.getName() + " values. DOT will use the last one. Line: " + ctx.getFirst() + " Position: " + ctx.getSecond();
                if(!warnings.contains(war)) {
                    this.warnings.add(war);
                }
            }
            if(att.getName().equals("color")) lastNodeColor = att.getStrValue();
            else if(att.getName().equals("style")) lastNodeStyle = att.getStrValue();
            else if(att.getName().equals("fillcolor")) lastNodeFillcolor = att.getStrValue();
            else if(att.getName().equals("shape")) lastNodeShape = att.getStrValue();
            else if(att.getName().equals("sides")) lastNodeSides = att.getStrValue();
        }
    }

    private void linkRepeatedAttributes(Link l){
        Pair ctx = linkMap.get(l.getId());
        for(Attribute att : l.attributes){
            if(repeatedAttr(att.getName(), l.attributes)){
                String war = "Link " + l.getSource().getName() + "-->" + l.getTarget().getName() +
                        " has multiple " + att.getName() + " values. DOT will use the last one. Link line: " + ctx.getFirst() + " Position: " + ctx.getSecond();
                if(!warnings.contains(war)) {
                    this.warnings.add(war);
                }
            }
            if(att.getName().equals("arrowhead")) lastLinkArrowHead = att.getStrValue();
            else if(att.getName().equals("arrowtail")) lastLinkArrowTail = att.getStrValue();
            else if(att.getName().equals("dir")) lastLinkDir = att.getStrValue();
            else if(att.getName().equals("arrowsize")) lastLinkArrowSize = att.getStrValue();
        }
    }

    private void groupRepeatedAttributes(Group g){
        Pair ctx = groupMap.get(g.getId());
        for(Attribute att : g.attributes){
            if(repeatedAttr(att.getName(), g.attributes)){
                String war = "Group " + g.getId() + " has multiple " + att.getName() + " values. DOT will use the last one. Group line: " + ctx.getFirst() + " Position: " + ctx.getSecond();
                if(!warnings.contains(war)) {
                    this.warnings.add(war);
                }
            }
            if(att.getName().equals("style")) lastGroupStyle = att.getStrValue();
            else if(att.getName().equals("color")) lastGroupColor = att.getStrValue();
            else if(att.getName().equals("fillcolor")) lastGroupFillcolor = att.getStrValue();
            else if(att.getName().equals("bgcolor")) lastGroupBGcolor = att.getStrValue();
        }
    }

    private void additionalNodeChecks(Node n){
        nodeStyleCheck(n);
        nodeShapeCheck(n);
    }

    private void nodeStyleCheck(Node n){
        Pair ctx = nodeMap.get(n.getId());
        if(lastNodeStyle.equals("filled")) {
            if (lastNodeFillcolor.equals("") && !lastNodeColor.equals("")) {
                String war = "Node " + n.getName() + "'s STYLE is FILLED but no FILLCOLOR is SET. Color " + lastNodeColor.toUpperCase() + " will be used. Node line: " + ctx.getFirst() + " Position: " + ctx.getSecond();
                warnings.add(war);
            } else if (lastNodeFillcolor.equals("") && lastNodeColor.equals("")) {
                String war = "Node " + n.getName() + "'s STYLE is FILLED but no FILLCOLOR OR COLOR is SET. Default Color (GRAY) will be used. Node line: " + ctx.getFirst() + " Position: " + ctx.getSecond();
                warnings.add(war);
            }
        }else {
            if(!lastNodeFillcolor.equals("")) {
                String war = "Node " + n.getName() + "'s has a defined FILLCOLOR(" + lastNodeFillcolor + ") but style isn't FILLED. Node line: " + ctx.getFirst() + " Position: " + ctx.getSecond();
                warnings.add(war);
            }
        }
    }

    private void nodeShapeCheck(Node n){
        Pair ctx = nodeMap.get(n.getId());

        if(!lastNodeShape.equals("")){
            if(lastNodeShape.equals("polygon")){
                if(lastNodeSides.equals("")){
                    String war = "Node " + n.getName() + "'s SHAPE is POLYGON but no SIDES are set. Default SHAPE will be used. Node line: " + ctx.getFirst() + " Position: " + ctx.getSecond();
                    warnings.add(war);
                } else {
                    int nos = Integer.parseInt(lastNodeSides);
                    if(nos < 3){
                        String war = "Node " + n.getName() + "'s SIDES must be at least 3. Default SHAPE will be used. Node line: " + ctx.getFirst() + " Position: " + ctx.getSecond();
                        warnings.add(war);
                    }
                }
            }
        }

        if(!lastNodeSides.equals("") && !lastNodeShape.equals("polygon")){
            String war = "Node " + n.getName() + " has SIDES set but SHAPE isn't POLYGON. Default SHAPE will be used. Node line: " + ctx.getFirst() + " Position: " + ctx.getSecond();
            warnings.add(war);
        }
    }

    private void additionalLinkChecks(Link l){
        linkCheckArrows(l);
    }

    private void linkCheckArrows(Link l){
        Pair ctx = linkMap.get(l.getId());
        Node source = l.getSource();
        Node target = l.getTarget();
        if(lastLinkDir.equals("") && !lastLinkArrowTail.equals("")){
            if(target == null || source == null){
                warnings.add("Link has an ARROWTAIL but no DIR. Link line: " + ctx.getFirst() + " Position: " + ctx.getSecond());
            } else {
                warnings.add("Link " + source.getName() + "(" + source.getId() + ")" +
                        "-->" + target.getName() + "(" + target.getId() + ")" + " has an ARROWTAIL but no DIR. Link line: " + ctx.getFirst() + " Position: " + ctx.getSecond());
            }
        }
        if(!lastLinkArrowHead.equals("")){
            if(lastLinkDir.equals("none")|| lastLinkDir.equals("back")){
                if(target == null || source == null) {
                    warnings.add("Link has an has an ARROWHEAD that will not show up due to DIR. Link line: " + ctx.getFirst() + " Position: " + ctx.getSecond());
                } else {
                    warnings.add("Link " + source.getName() + "(" + source.getId() + ")" +
                            "-->" + target.getName() + "(" + target.getId() + ")" + " has an ARROWHEAD that will not show up due to DIR. Link line: " + ctx.getFirst() + " Position: " + ctx.getSecond());
                }
            }
        }
        if(!lastLinkArrowTail.equals("")){
            if(lastLinkDir.equals("none") || lastLinkDir.equals("front")){
                if(target == null || source == null) {
                    warnings.add("Link has an ARROWTAIL that will not show up due to DIR. Link line: " + ctx.getFirst() + " Position: " + ctx.getSecond());
                } else {
                    warnings.add("Link " + source.getName() + "(" + source.getId() + ")" +
                            "-->" + target.getName() + "(" + target.getId() + ")" + " has an ARROWTAIL that will not show up due to DIR. Link line: " + ctx.getFirst() + " Position: " + ctx.getSecond());
                }
            }
        }
        if(lastLinkDir.equals("none") && !lastLinkArrowSize.equals("")){
            if(target == null || source == null) {
                warnings.add("Link has an ARROWSIZE that will not have any effect due to DIR. Link line: " + ctx.getFirst() + " Position: " + ctx.getSecond());
            } else {
                warnings.add("Link " + source.getName() + "(" + source.getId() + ")" +
                        "-->" + target.getName() + "(" + target.getId() + ")" + " has an ARROWSIZE that will not have any effect due to DIR. Link line: " + ctx.getFirst() + " Position: " + ctx.getSecond());
            }
        }
    }

    private void additionalGroupChecks(Group g){
        groupStyleCheck(g);
    }

    private void groupStyleCheck(Group g){
        Pair ctx = groupMap.get(g.getId());
        if(lastGroupStyle.equals("filled")){
            if(lastGroupFillcolor.equals("") && !lastGroupColor.equals("") && lastGroupBGcolor.equals("")){
                String war = "Group " + g.getId() + "'s STYLE is FILLED but no FILLCOLOR is SET. Color " + lastGroupColor.toUpperCase() + " will be used. Group line: " + ctx.getFirst() + " Position: " + ctx.getSecond();
                warnings.add(war);
            } else if(lastGroupFillcolor.equals("") && lastGroupColor.equals("") && lastGroupBGcolor.equals("")){
                String war = "Group " + g.getId() + "'s STYLE is FILLED but no FILLCOLOR OR COLOR is SET. Default Color (GRAY) will be used. Group line: " + ctx.getFirst() + " Position: " + ctx.getSecond();
                warnings.add(war);
            } else if(!lastGroupBGcolor.equals("") && lastGroupFillcolor.equals("") && lastGroupColor.equals("")){
                String war = "Group " + g.getId() + "'s STYLE is FILLED but BGCOLOR is set. STYLE is unnecessary";
                warnings.add(war);
            } else if(!lastGroupBGcolor.equals("") && !lastGroupFillcolor.equals("")){
                String war = "Group " + g.getId() + "'s STYLE is FILLED and FILLCOLOR is set but BGCOLOR is also set. FILLCOLOR will be used. Group line: " + ctx.getFirst() + " Position: " + ctx.getSecond();
                warnings.add(war);
            } else if(!lastGroupBGcolor.equals("") && !lastGroupColor.equals("")) {
                String war = "Group " + g.getId() + "'s STYLE is FILLED and COLOR is set but BGCOLOR is also set. COLOR will be used. Group line: " + ctx.getFirst() + " Position: " + ctx.getSecond();
                warnings.add(war);
            }
        }
        if(!lastGroupFillcolor.equals("") && !lastGroupStyle.equals("filled")){
            String war = "Group " + g.getId() + " has a defined FILLCOLOR but style isn't FILLED. Group line: " + ctx.getFirst() + " Position: " + ctx.getSecond();
            warnings.add(war);
        }
    }

    private boolean repeatedAttr(String attName, ArrayList<Attribute> atts){
        int noa = 1; // will find the attName at least once
        for(Attribute att : atts){
            if(att.getName().equals(attName)){
                noa++;
            }
        }
        if(noa > 2){
            return true;
        }
        return false;
    }

    private void clearLastNodeVars(){
        lastNodeColor = "";
        lastNodeStyle = "";
        lastNodeFillcolor = "";
        lastNodeShape = "";
        lastNodeSides = "";
    }

    private void clearLastLinkVars(){
        lastLinkArrowHead = "";
        lastLinkArrowTail = "";
        lastLinkDir = "";
        lastLinkArrowSize = "";
    }

    private void clearGroupVars(){
        lastGroupStyle = "";
        lastGroupColor = "";
        lastGroupFillcolor = "";
        lastGroupBGcolor = "";
    }
    /*
    LINK ATTRS
     */
    private String lastLinkArrowHead = "";
    private String lastLinkArrowTail = "";
    private String lastLinkArrowSize = "";
    private String lastLinkDir = "";
    /*
    NODE ATTRS
     */
    private String lastNodeColor = "";
    private String lastNodeStyle = "";
    private String lastNodeFillcolor = "";
    private String lastNodeShape = "";
    private String lastNodeSides = "";
    /*
    GROUP ATTRS
     */
    private String lastGroupStyle = "";
    private String lastGroupColor = "";
    private String lastGroupFillcolor = "";
    private String lastGroupBGcolor = "";

}

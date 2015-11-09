package InterRep;

import java.util.ArrayList;

public class Link {

    public static int id_count = 0;

    private int id;
    private Object tempsource;
    private Object temptarget;
    private int value;

    private Node source;
    private Node target;

    public ArrayList<Attribute> attributes = new ArrayList<>();

    public Link(Object source, Object target, int value){
        this.id = id_count++;
        this.tempsource = source;
        this.temptarget = target;
        this.value = value;
        attributes.add(new Attribute("minlen", Double.toString(value)));
    }

    public int getId(){return this.id;}
    public Node getSource(){return this.source;}
    public Node getTarget(){return this.target;}
    public Object getTempSource(){return this.tempsource;}
    public Object getTempTarget(){return this.temptarget;}
    public int getValue(){return this.value;}
    public void setSource(Node source){
        this.source = source;
    }
    public void setTarget(Node target){
        this.target = target;
    }

    @Override
    public boolean equals(Object other){
        if (other == null) return false;
        if (other == this) return true;
        if (!(other instanceof Node))return false;
        Link otherL = (Link)other;
        if(this.source == otherL.source && this.target == otherL.target){
            return true;
        } else return false;
    }

}

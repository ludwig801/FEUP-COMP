package InterRep;

import java.util.ArrayList;

public class Node {

    public static int id_count = 0;

    private int id;
    private String name;
    private Integer group;
    public ArrayList<Attribute> attributes = new ArrayList<>();

    public Node(String name, Integer group){
        this.id = id_count++;
        this.name = name;
        this.group = group;
    }

    public String getName(){return this.name;}
    public Integer getGroup(){return this.group;}
    public int getId(){return this.id;}

    @Override
    public boolean equals(Object other){
        if (other == null) return false;
        if (other == this) return true;
        if (!(other instanceof Node))return false;
        Node otherN = (Node)other;
        if(this.getName().equals(otherN.getName())){
            return true;
        } else return false;
    }
}

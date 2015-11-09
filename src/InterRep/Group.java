package InterRep;

import java.util.ArrayList;

public class Group {



    private int id;
    public ArrayList<Node> nodes = new ArrayList<>();
    public ArrayList<Link> links = new ArrayList<>();
    public ArrayList<Attribute> attributes = new ArrayList<>();

    public Group(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof Group))return false;
        Group other = (Group)obj;
        if(other.getId() == this.id)
            return true;
        else return false;
    }
}

package InterRep;

public class Attribute {
    private String name;
    private String str_value;

    public Attribute(String name, String str_value){
        this.name=name.toLowerCase();
        this.str_value=str_value;
    }

    public String getName(){
        return this.name;
    }
    public String getStrValue(){
        return this.str_value;
    }
}

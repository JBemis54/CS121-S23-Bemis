package WeekSix;

public class Pokemon {
    //initialize variable
    String name;
    String type;
    String  nature;
    int number ;
    int level;

    //default constructor
    public Pokemon(){

    }
    //overloaded constructor
    public Pokemon (String name, int level){
        this.name = name;
        this.level = level;
    }

    //overloaded constructor
    public Pokemon (String name, String type, String nature, int number){
        this.name = name;
        this.type = type;
        this.nature = nature;
        this.number = number;

    }
    // method that prints values initialized in the test class
    void printPokemon() {
        System.out.println(name +"\n" + "Type: " + type +  "\n" + "Nature: " +
                nature + "\nNumber: " + number);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setLevel(String name, int level) {
        if (level > 99);
        this.name = name + "X";
    }
}


package WeekSix;

public class Test {

    public static void main(String[] args){

        //initialize pokemon object
        Pokemon pokemon1 = new Pokemon("MewTwo", "Psychic", "Jolly", 150 );

        // initialize 2nd pokemon object from different constructor
        Pokemon pokemon2 = new Pokemon("Lugia",25);
        //initialize 3rd pokemon using default constructor
        Pokemon pokemon3 = new Pokemon();

         /// initialize pokemon object
        Student student1 = new Student("Jacob", "Computer Science", 3.5, 5454 );

        // prints method displaying values initializing  pokemon object
        System.out.println("The following will print from the pokemon class.");
        pokemon1.printPokemon();

        // prints method displaying values initializing in student object
        System.out.println("The following will print from the student class.");
        student1.printStudent();


        //call overloaded methods
        // This segment is showing understanding of the overloaded methods by
        //printing the original initialized object and then the two overloaded
        // methods to show how it changes the object.
        System.out.println(pokemon2.name + " lv:" + pokemon2.level);
        pokemon2.setLevel(100);
        System.out.println(pokemon2.name + " lv:" + pokemon2.level);
        pokemon2.setLevel("Meowth",100);
        System.out.println(pokemon2.name  + " lv:" + pokemon2.level);



    }
}

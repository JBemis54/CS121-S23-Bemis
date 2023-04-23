package Week12;


public class HashMain {
    public static void main(String[] args){
        HashMap map = new HashMap();
        map.addBirthDate("Jacob",11);
        map.addBirthDate("Symphony",8);
        map.addBirthDate("Jude",10);

        map.displayBirthDate();

        map.removeBirthdate("Symphony");

        map.displayBirthDate();
    }


}

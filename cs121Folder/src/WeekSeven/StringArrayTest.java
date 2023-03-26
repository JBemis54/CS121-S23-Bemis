package WeekSeven;

public class StringArrayTest {
    public static void main(String[] args){
        StringArrayList demo = new StringArrayList();

        demo.addWords("Josies's");
        demo.addWords("on ");
        demo.addWords("a ");
        demo.addWords("vaction ");
        demo.addWords("far");
        demo.addWords("away");
        demo.addWords("come");
        demo.addWords("around");

        demo.forDisplay();

        demo.removeWords("come");
        demo.removeWords("around");

        demo.forEachDisplay();

        System.out.println(demo.wordLength());
        System.out.println(demo.getWord(0));
    }
}

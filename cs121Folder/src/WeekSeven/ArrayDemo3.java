package WeekSeven;

public class ArrayDemo3 {

    public static void main(String[] args) {
        String[][] array = {{"Just", "small", "town" }, {"girl", "living", "in" }, {"a", "lonely", "world", "!"}};
        for (String[] row : array) {
            for (String column : row) {
                System.out.printf("%s ", column);
            }
            System.out.println();

        }
    }
}
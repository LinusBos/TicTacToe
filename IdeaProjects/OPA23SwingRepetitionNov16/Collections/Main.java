import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Diana");
        strings.add("Simon");
        strings.add("Silver");

        for(String string : strings) {
            System.out.println(string);
        }

        LinkedList<String> strings2 = new LinkedList<>();
        strings2.add("Lennart");
        strings2.add("Leif");
        strings2.add("Janne");
        strings2.add("Annica");

        for(String string : strings2) {
            System.out.println(string);
        }
    }
}

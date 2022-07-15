import java.util.ArrayList;
import java.util.HashSet;

public class SetCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("spring");
        list.add("spring");
        System.out.println(list);

        HashSet<String> list2 = new HashSet<>(list);
        System.out.println(list2);
    }
}

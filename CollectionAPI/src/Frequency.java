import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(589);
        list.add(56);
        list.add(2);

        System.out.println(Collections.frequency(list, 2));//2

        List<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("spring");
        list1.add("boot");

        System.out.println(Collections.frequency(list1, "java"));//1
    }
}

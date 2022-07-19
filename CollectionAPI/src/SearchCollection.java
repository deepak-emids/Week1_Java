import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(589);
        list.add(56);

        System.out.println(Collections.binarySearch(list, 2));//1

        List<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("spring");
        list1.add("boot");

        System.out.println(Collections.binarySearch(list1, "java"));//0
    }


}

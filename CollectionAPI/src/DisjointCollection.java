import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//two collections are disjoint if they have no elements in common.
public class DisjointCollection {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("spring");
        list1.add("boot");

        List<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("two");

        List<String> list3 = new ArrayList<>();
        list2.add("three");
        list2.add("spring");

        System.out.println(Collections.disjoint(list1, list2));//false

        System.out.println(Collections.disjoint(list1, list3));//true


    }
}

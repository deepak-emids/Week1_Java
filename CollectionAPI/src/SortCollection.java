import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCollection {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(589);
        list.add(56);
        list.add(2);

        Collections.sort(list);
        System.out.println(list);//[1, 2, 2, 56, 589]
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);//[589, 56, 2, 2, 1]

        List<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("spring");
        list1.add("boot");
        Collections.sort(list1);
        System.out.println(list1);//[boot, java, spring]
    }
}

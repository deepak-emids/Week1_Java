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
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}

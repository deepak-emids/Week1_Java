import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateCollection {

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(589);
            list.add(56);
            list.add(2);

            Collections.rotate(list,2);
            System.out.println(list);//[56, 2, 1, 2, 589]

            List<String> list1 = new ArrayList<>();
            list1.add("java");
            list1.add("spring");
            list1.add("boot");

            Collections.rotate(list1,1);
            System.out.println(list1);//[boot, java, spring]
        }
}

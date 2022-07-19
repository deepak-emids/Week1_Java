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
            System.out.println(list);
        }
}

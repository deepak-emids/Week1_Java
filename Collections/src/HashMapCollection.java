import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        System.out.println(map);

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getValue() + "  " + m.getKey());
        }

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(100, "Amit");
        hmap.put(101, "Vijay");
        hmap.put(102, "Rahul");
        hmap.put(103, "Gaurav");
        System.out.println("Initial list of elements: " + hmap);
        hmap.remove(100);
        System.out.println("Updated list of elements: " + hmap);
    }
}

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(10, "java");
        hm.put(11, "spring");
        hm.put(12, "boot");

        //traversing
        System.out.println("traversing");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //replace
        hm.replace(11, "java1");

        //contains
        System.out.println("contains  "+hm.containsKey(10));

        //keys
        System.out.println("keys  "+hm.keySet());

        //values
        System.out.println("values  "+hm.values());

        //remove
        hm.remove(10);

        hm.putIfAbsent(10, "absent");

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());

        }
    }
}

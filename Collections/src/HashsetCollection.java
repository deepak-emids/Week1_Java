import java.util.HashSet;

public class HashsetCollection {
    public static void main(String[] args) {
        // Creating an empty HashSet of string entities
        HashSet<String> hs = new HashSet<String>();

        // Adding elements using add() method
        hs.add("java");
        hs.add("collection");
        hs.add("B");


        // Printing all string entries inside the Set
        System.out.println("HashSet elements : " + hs);

        // Removing the element B
        hs.remove("B");

        // Printing the updated HashSet elements
        System.out.println("After removing element " + hs);

        System.out.println(hs.size());
        System.out.println(hs.contains("java"));
        System.out.println(hs.isEmpty());
        System.out.println(hs.equals("java"));

        String[] arr = new String[hs.size()];
        hs.toArray(arr);

        for (String n : arr)
            System.out.println("array elements  " + n);
    }
}

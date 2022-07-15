import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistCollection {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();

        a.add("java");
        a.add("avaj");
        a.add("spring");
        a.add("boot");

        b.add("avaj");

        System.out.println(a);//[java, avaj, spring, boot]

        for (String s : a) {
            System.out.println("inside foreach" + "--" + s);
        }//inside foreach--java avaj spring boot

        /*shorthand for foreach*/
        a.forEach(System.out::println);


        Iterator itr = a.iterator();
        while (itr.hasNext()) {
            System.out.println("inside list iterator" + "--" + itr.next());
        }

        Collections.sort(a);
        System.out.println("sorted list" + "--" + a);

        System.out.println("get()" + "--" + a.get(1));//avaj

        a.set(0, "Zero");
        System.out.println(a);//[Zero, avaj, spring, boot]

        a.addAll(b);
        System.out.println(a);//[Zero, avaj, spring, boot, avaj]

        System.out.println("contains" + "--" + a.contains("java"));//false

        System.out.println("size" + "--" + a.size());//5

        System.out.println("is Empty" + "--" + a.isEmpty());//false

        System.out.println("lastIndexOf" + "--" + a.lastIndexOf("java"));//1

        System.out.println("toArray" + "--" + a.toArray().toString());//

        System.out.println("sublist" + "--" + a.subList(0, 2));//[Zero, avaj]

        a.remove(0);
        System.out.println(a);//[avaj, spring, boot, avaj]

        a.clear();
        System.out.println(a);//[]

        //a.removeAll();
        //System.out.println(a);

        //a.clone(b);
        //System.out.println(a);

//        toArray(Object[] O);
//        trimToSize();
//        ensureCapacity?(int minCapacity);
//        indexOf(Object O);
//        listIterator?();
//        listIterator?(int index);
//        removeIf?(Predicate filter);
//        removeRange?(int fromIndex, int toIndex);
//        retainAll?(Collection<?> c);
//        spliterator?();

    }
}

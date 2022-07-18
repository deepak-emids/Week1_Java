import java.util.LinkedList;

class LinkedListCollection {
    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<Integer>();

        l.addFirst(1001);
        l.addLast(1001);
        l.addFirst(1002);
        l.removeLast();

        System.out.println("get()  "+l.get(1));//1001

        System.out.println(l);//[1002, 1001]

    }
}

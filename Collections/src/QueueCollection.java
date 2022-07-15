import java.util.*;

public class QueueCollection {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        //PriorityQueue<String> queue=new PriorityQueue<>();

        queue.add("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");

        queue.remove();//[two, three, four]
        System.out.println("queue" + "--" + queue);

        queue.poll();//[three, four]
        System.out.println("poll" + "--" + queue);

        queue.element();//[three, four]
        System.out.println("element" + "--" + queue);

        queue.peek();//[three, four]
        System.out.println("peek" + "--" + queue);


    }
}

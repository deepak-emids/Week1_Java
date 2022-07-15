import java.util.Stack;

public class StackCollection {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("peek" + "--" + stack.peek());//4

        System.out.println("search" + "--" + stack.search(1));//4

        stack.pop();
        System.out.println("pop" + "--" + stack);//[1, 2, 3]

        stack.empty();
        System.out.println("empty" + "--" + stack);//[1, 2, 3]
    }


}

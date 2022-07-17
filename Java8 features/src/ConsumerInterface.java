import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Consumer is an interface and only implements one   accept   Method, you can output information as a "consumer".
 * In fact, the return values of lambda expressions and method references are   Consumer types,
 * so they can act as   forEach   Method and outputs a value.
 */
public class ConsumerInterface<T> {
    public static void main(String[] args) {
        //use consumer Interface implementation method
        Consumer<String> consumer = new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        Stream<String> stream = Stream.of("aaa", "bbb", "ddd", "ccc", "fff");
        stream.forEach(consumer);

        //use lambda expression, forEach What the method needs is one Consumer Interface
        stream = Stream.of("aaa", "bbb", "ddd", "ccc", "fff");
        Consumer<String> consumer1 = (s) -> System.out.println(s);//lambda The expression returns a Consumer Interface
        stream.forEach(consumer1);
        //More direct way

        //stream.forEach((s) -> System.out.println(s));

        //stream.forEach(System.out::println);
    }
}

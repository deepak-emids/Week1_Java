import java.util.function.Function;
import java.util.stream.Stream;

public class FunctonInterface {
    public static void main(String[] args) {
        /**
         * Function interface is a functional interface, which is used to convert data.
         * Function interface implementation   apply   Method to do the conversion.
         * */

        //use map Method, the first parameter of the generic type is the type before conversion,
        //and the second is the type after conversion
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();//Gets the length of each string and returns
            }
        };

        Stream<String> stream = Stream.of("aaa", "bbbbb", "ccccccv");
        Stream<Integer> stream1 = stream.map(function);
        stream1.forEach(System.out::println);
    }
}

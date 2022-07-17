import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Predicate is a predicate interface. In fact, it only plays a judgment role.
 * Predicate implements a   test   Method to make judgment
 **/

public class PredicateInterface<T> {
    public static void main(String[] args) {
        //use Predicate Interface implementation method,only one test Method, pass in a parameter and return a bool value
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer > 5) {
                    return true;
                }
                return false;
            }
        };
        System.out.println(predicate.test(6));

        //use lambda expression,
        predicate = (t) -> t > 5;
        System.out.println(predicate.test(1));
    }
}

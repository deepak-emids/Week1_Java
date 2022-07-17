import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * We implement a Supplier object by creating a Supplier object  get() Method, which has no parameters and returns a value;
 * Therefore, every time you use this interface, a value will be returned and saved in this interface, so it is a container
 */

public class SupplierInterface<T> {
    public static void main(String[] args) {
        //use Supplier Interface implementation method,only one get Method, no parameters, returns a value
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                //Returns a random value
                return new Random().nextInt();
            }
        };

        System.out.println(supplier.get());

        //use lambda expression,
        supplier = () -> new Random().nextInt();
        System.out.println(supplier.get());

        //Use method reference
        Supplier<Double> supplier2 = Math::random;
        System.out.println(supplier2.get());
    }
}

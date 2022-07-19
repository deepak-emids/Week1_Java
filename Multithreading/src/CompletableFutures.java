import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Limitations of the Future
 * A Future cannot be mutually complete.
 * We cannot perform further action on a Future's result without blocking.
 * Future has not any exception handling.
 * We cannot combine multiple futures.
 */

/*Future has so many limitations, that's why we have CompletableFuture.*/
/**
 * CompletableFuture provides a broad set of methods for creating multiple Futures, chaining, and combining.
 * It also has comprehensive exception handling support.
 */

/*The most frequently used CompletableFuture methods are:*/
/**
 * supplyAsync(): It completes its job asynchronously. The result of supplier is run by a task from ForkJoinPool.commonPool() as default.
 * The supplyAsync() method returns CompletableFuture on which we can apply other methods.
 *
 * thenApply(): The method accepts function as an arguments. It returns a new CompletableStage when this stage completes normally.
 * The new stage use as the argument to the supplied function.
 *
 * join(): the method returns the result value when complete.
 * It also throws a CompletionException (unchecked exception) if completed exceptionally.
 */
public class CompletableFutures {
    public static void main(String[] args) {
        try {
            List<Integer> list = Arrays.asList(2);
            list.stream()
                    .map(num -> CompletableFuture.supplyAsync(() -> getNumber(num)))
                    .map(CompletableFuture -> CompletableFuture.thenApply(n -> n * n))
                    .map(t -> t.join())
                    .forEach(s -> System.out.println(s));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int getNumber(int a) {
        return a * a;
    }
}

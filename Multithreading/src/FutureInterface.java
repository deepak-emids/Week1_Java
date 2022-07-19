import java.util.concurrent.*;

public class FutureInterface {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService e = Executors.newFixedThreadPool(10);

        //submit task and accept placeholder object in return
        Future<Integer> f = e.submit(new sumCallable(10));

        //whenever task is complete get the value
        System.out.println(f.get());
    }
}

class sumCallable implements Callable<Integer> {
    private int input;

    public sumCallable(int input) {
        super();
        this.input = input;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum = sum+i;
        }
        return sum;
    }
}

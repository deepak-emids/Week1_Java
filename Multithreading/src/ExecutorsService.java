
/**
 * The ExecutorService helps in maintaining a pool of threads and assigns them tasks.
 * It also provides the facility to queue up tasks until there is a free thread available
 * if the number of tasks is more than the threads available.
 */

/*Instantiation*/

/**
 * Instantiating ExecutorService
 * We can use Java ExecutorService to create a single thread, a pool of threads, or a scheduled pool of threads.
 * To assign a task to ExecutorService, we can use the following methods-
 */
// Creates a ExecutorService object having a single thread.
//ExecutorService executorService1 = Executors.newSingleThreadExecutor();

// Creates a ExecutorService object having a pool of 10 threads.
//ExecutorService executorService2 = Executors.newFixedThreadPool(10);

// Creates a scheduled thread pool executor with 10 threads. In scheduled thread //pool, we can schedule tasks of the threads.
//ExecutorService executorService3 = Executors.newScheduledThreadPool(10);


/**To assign a task to ExecutorService, we can use the following methods-
 */
//execute(Runnable task)
//submit(Runnable task) / submit(Callable<T> task)
//invokeAny(Collection<? extends Callable<T>> tasks)
//invokeAll(Collection<? extends Callable<T>> tasks)


import java.util.concurrent.*;
/**
 * The process of shutting down can be done by the following three methods-
 */
//shutdown() method
//shutdownNow() method
//awaitTermination() method

public class ExecutorsService {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService e = Executors.newFixedThreadPool(10);

        //submit task and accept placeholder object in return
        e.submit(new Test("gi"));
        e.shutdown();
    }
}

class Test implements Callable<String> {
    String s;

    public Test(String s) {
        this.s = s;
    }

    @Override
    public String call() throws Exception {
        System.out.println(s);
        return s;
    }
}

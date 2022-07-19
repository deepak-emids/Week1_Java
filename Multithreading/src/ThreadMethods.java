public class ThreadMethods extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        //nameing threads
        ThreadMethods tm = new ThreadMethods();
        Thread t1 = new Thread(tm);
        t1.setName("thread1");
        System.out.println(t1.getName());

        //thread sleep
        ThreadMethods t2 = new ThreadMethods();
        t2.start();
    }
}

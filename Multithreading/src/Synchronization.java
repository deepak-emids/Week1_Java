public class Synchronization {
    public static void main(String[] args) {
        SynchronizedClass s = new SynchronizedClass();

        Thread t1 = new Thread() {
            public void run() {
                while (true) {
                    s.synchronizedMethod("thread1");
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                while (true) {
                    s.synchronizedMethod("thread2");
                }
            }
        };
        t1.start();
        t2.start();
    }
}

class SynchronizedClass {
    synchronized void synchronizedMethod(String string) {
        System.out.println(string);
    }
}

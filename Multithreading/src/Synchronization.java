public class Synchronization {
    public static void main(String[] args) {
        SynchronizedClass s = new SynchronizedClass();

        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 3; i++) {
                    s.synchronizedMethod("thread1");
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 3; i++) {
                    s.synchronizedMethod("thread2");
                }
            }
        };
        t1.start();
        t2.start();
    }
}

class SynchronizedClass {
    void synchronizedMethod(String string) {
        System.out.println(string);
    }
}

/*output is different each time*/
    /*output before sync
    thread1
    thread2
    thread2
    thread2
    thread1
    thread1
    */

/*out put is same every time*/
    /*output after sync
    thread2
    thread2
    thread2
    thread1
    thread1
    thread1
     */
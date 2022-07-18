/**
 * There are two ways of implementing threading in Java.
 */
class Multithreading {
    public static void main(String[] args) {
        //case 1
        Thread1 t1 = new Thread1();
        t1.start();

        //case 2
        Thread2 t2 = new Thread2();
        Thread t3 = new Thread(t2);
        t3.start();
    }
}

/**
 * 1.Extending the java.lang.Thread class
 */
class Thread1 extends Thread {
    @Override
    public void run() {

        System.out.println("by thread class");
    }
}

/**
 * 2.Implementing the java.lang.Runnable interface
 */
class Thread2 implements Runnable {
    @Override
    public void run() {

        System.out.println("by runnable interface");
    }
}
public class ExceptionTypes {


    public static void main(String[] args) {

        /*Unchecked*/
        //ArrayIndexOutOfBoundsException:
        int[] x = new int[10];
        System.out.println(x[0]);//valid
        System.out.println(x[100]);//AIOOBE
        System.out.println(x[-100]);//AIOOBE

        //NullPointerException:
        String s = null;
        System.out.println(s.length()); //R.E: NullPointerException

        //stackOverFlowError
        methodOne();

        //NoClassDefFoundError:
        //It is the child class of Error and hence it is unchecked. JVM will raise this error
        //automatically whenever it is unable to find required .class file

        //ClassCastException:
        //It is the child class of RuntimeException and hence it is unchecked. Raised
        //automatically by the JVM whenever we are trying to type cast parent object to
        //child type.

        //ExceptionInInitializerError:
        //It is the child class of Error and it is unchecked. Raised automatically by the
        //JVM, if any exception occurs while performing static variable initialization and
        //static block execution.

        //IllegalArgumentException
        Thread t = new Thread();
        t.setPriority(10);//valid
        t.setPriority(100);//invalid

        //NumberFormatException
        //attempting to convert string to the number. But the string is not properly formatted.
        int i = Integer.parseInt("10");
        int j = Integer.parseInt("ten");


        //llegalStateException:method
        //has been invoked at inappropriate time.

        //AssertionError
        //Assert statement fails.


    }

    public static void methodOne() {
        methodTwo();
    }

    public static void methodTwo() {
        methodOne();
    }
}









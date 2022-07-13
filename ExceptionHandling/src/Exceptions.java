public class Exceptions {

    private static void method(int input) {
        System.out.println(10 / input);
    }

    public static void main(String[] args) {
        int[] array = new int[1];
        String name = null;

        /*without exception*/
        /*abnormal termination*/

        //case 1
        //method(0);//Output:Exception in thread "main" java.lang.ArithmeticException: / by zero

        //case 2
        //System.out.println(array[5]);//Output:Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 1

        //case 3
        //System.out.println(name.equals("abc"));//Output:Exception in thread "main" java.lang.NullPointerException


        /*with  exception*/
        /*normal termination*/

        //case 1
        //Output:catch block of ArithmeticException/finally block
        try {
            method(0);
        } catch (ArithmeticException e) {
            System.out.println("catch block of ArithmeticException");
        } finally {
            System.out.println("finally block");
        }

        //case 2
        //Output:catch block of ArrayIndexOutOfBoundsException/finally block
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("catch block of ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("finally block");
        }

        //case 3
        //Output:catch block of NullPointerException/finally block
        try {
            System.out.println(name.equals("abc"));
        } catch (NullPointerException e) {
            System.out.println("catch block of NullPointerException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("finally block");
        }
    }
}

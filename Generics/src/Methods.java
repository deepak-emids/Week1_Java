public class Methods {

    //generic method
    public static <T> void test(T arg) {

        System.out.println(arg);
    }

    public static void main(String[] args) {

        //passing string arguments
        test("hi");

        //passing integer arguments
        test(5);

        //passing character
        test('l');

    }


}

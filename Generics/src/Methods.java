public class Methods {

    //generic method
    public static <T> void test(T arg) {
        System.out.println(arg);
    }

    public static void main(String[] args) {
        test("hi");
    }
}
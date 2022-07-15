
interface maths {
    int operation(int a, int b);
}

public class LambdaExample {
        public static void main(String[] args) {
            maths add = (a, b) -> a + b;
            System.out.print("Addition-->"+add.operation(2,3));

            maths multiply = (a, b) -> a * b;
            System.out.println("Multiplication-->"+multiply.operation(3, 5));
        }

}

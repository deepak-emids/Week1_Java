
//interface which has only one abstract method is functional interface.
interface interf {
    void greet();
}

//implementation of interface without lambda
public class FunctionalInterface implements interf {
    public static void main(String[] args) {
        FunctionalInterface f = new FunctionalInterface();
        f.greet();
    }

    @Override
    public void greet() {
        System.out.println("good day");
    }
}

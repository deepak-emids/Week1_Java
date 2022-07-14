
//used to provide implementation of functional interface
//we don't need to define a class and a method to define the implementation of interface
public class LambdaExpressions {
    public static void main(String args[]) {

        fInterf g = message -> System.out.println("Good" + message);
        g.greet("day");
    }
}

interface fInterf {
    void greet(String message);
}





abstract class abs {
    public abstract void absMethod();

    public void concreteMethod() {
        System.out.println("abstract class can have concrete method also");
    }
}

public class Abstraction extends abs {

    @Override
    public void absMethod() {
        System.out.println("this is implemented abstract method");
    }

    public static void main(String[] args) {
        Abstraction a = new Abstraction();
        a.absMethod();//Output-this is implemented abstract method
        a.concreteMethod();//Output-abstract class can have concrete method also
    }

    /*cannot create object for abstract methods*/
    //abs as = new abs();

}

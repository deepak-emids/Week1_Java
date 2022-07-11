//Overloading takes place in same class
public class Overloading {

    public void eat() {
        System.out.println("Polymorphism is  eating");
    }

    public void eat(String who){
        System.out.println(who+"is eating");
    }

    public static void main(String[] args) {
        Overloading ol = new Overloading();

        //Overloading
        ol.eat();
        ol.eat("Overloading");
    }
}

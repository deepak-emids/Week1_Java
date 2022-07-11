
//Is-A Relationship

class Parent {
    public void parentMethod() {
        System.out.println("parent method");
    }
}

class Child extends Parent {

    public void childMethod() {
        System.out.println("child method");
    }

    public static void main(String[] args) {
        //case 1
        Parent p = new Parent();
        //p.childMethod(); //parent cannot access child class method
        p.parentMethod();   //parent can access only parent class method

        //case 2
        Child c = new Child();
        c.childMethod();//child object can access child class and parent class method
        c.parentMethod();

        //case 3
        Parent parentReference = new Child();
        parentReference.parentMethod();
        //parentReference.childMethod() //Not applicable

        //case 4
        //Child childReference = new Parent(); //not applicable

    }
}

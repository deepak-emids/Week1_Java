class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Overriding extends Animal {
    @Override
    public void eat() {
        System.out.println("overriding is eating");
    }

    public static void main(String[] args) {
        //case 1
        Overriding o = new Overriding();
        o.eat();//

        //case 2
        Animal a = new Overriding();
        a.eat();
    }

}



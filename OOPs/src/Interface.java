interface interf {
    void abs();
}

class Interface implements interf {

    public static void main(String[] args) {
        Interface i = new Interface();
        i.abs();
    }

    @Override
    public void abs() {
        System.out.println("this is implemented method from interface");
    }
}
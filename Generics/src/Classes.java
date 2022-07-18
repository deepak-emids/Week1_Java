
//generic class
class Test<T> {
    T obj;

    Test(T obj) {
        this.obj = obj;
    }

    public T testMethod() {

        return this.obj;
    }
}

public class Classes {
    public static void main(String[] args) {
        Test<Integer> i = new Test<Integer>(20);
        System.out.println(i.testMethod());
    }
}

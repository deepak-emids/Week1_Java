
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
        //pass interger value to class construcotr
        Test<Integer> i = new Test<Integer>(20);

        //pass interger value to class construcotr
        Test<Character> j = new Test<Character>('c');

        //pass double value to class construcotr
        Test<Double> k = new Test<Double>(1.2);

        System.out.println(i.testMethod());//20
        System.out.println(j.testMethod());//c
        System.out.println(k.testMethod());//1.2

    }
}

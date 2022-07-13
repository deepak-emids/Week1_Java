public class InnerClass {
}

class Outer {
    String outerVariable = "outer class varible";

    /*case 1 - Normal inner class*/
    private class Inner {
        void msg() {
            System.out.println("this is normal inner class");

        }
    }

    /*case 2 - static inner class*/
    static class StaticInner {
        void msg() {
            System.out.println("this is static inner class");
        }
    }

    public static void main(String[] args) {
        Outer outerObj = new Outer();
        System.out.println(outerObj.outerVariable);//outer class varible

        //case 1
        Outer.Inner innerObj = outerObj.new Inner();
        //System.out.println(o.ivariable);//not accessible
        innerObj.msg();//inner class varible

        //case 2
        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.msg();//this is static inner class

    }
}
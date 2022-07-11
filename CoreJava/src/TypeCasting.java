public class TypeCasting {
    public static void main(Strings[] args) {

        //Widening Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myDouble);//9.0

        //Narrowing Casting
        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble; // Manual casting: double to int
        System.out.println(myInt);// Outputs 9
    }

}

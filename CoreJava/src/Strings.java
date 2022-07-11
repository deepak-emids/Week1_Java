public class Strings {
    public static void main(Strings[] args) {

        //creating string
        String s1 = "java";//creating string by Java string literal
        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s2 = new String(ch);//converting char array to string
        String s3 = new String("example");//creating Java string by new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //immutability
        String s = "hi";
        s.concat("java");//concat() method appends the string at the end
        System.out.println(s);//hi

        s = s.concat("java");
        System.out.println(s);//hijava

        //Comparison
        //1.equals() Method
        //2. == Operator
        //3.compareTo() Method

        /*equals() Method checks content*/
        String x = "java";
        String y = "java";
        String z = new String("java");
        String o = "avaj";
        System.out.println(x.equals(y));//true
        System.out.println(x.equals(z));//true
        System.out.println(x.equals(o));//false

        /*==  checks address*/
        String s11 = "java";
        String s22 = "java";
        String s33 = new String("java");
        System.out.println(s11 == s22);//true (because both refer to same instance)
        System.out.println(s11 == s33);//false(because s3 refers to instance created in nonpool)

        /*compareTo() compares lexicographically*/
        String ss1 = "java";
        String ss2 = "java";
        String ss3 = "avaj";
        System.out.println(ss1.compareTo(ss2));//0
        System.out.println(ss1.compareTo(ss3));//1(because s1>s3)
        System.out.println(ss3.compareTo(ss1));//-1(because s3 < s1 )

        //Concatination

        //+ operator
        String a = "java" + " avaj";
        System.out.println(a);//java avaj

        String b = 50 + 30 + "java" + 40 + 40;
        System.out.println(b);//80java4040

        //Concat
        String aa = "java ";
        String bb = "avaj";
        String cc = aa.concat(bb);
        System.out.println(cc);//java avaj

        //String Builder
        StringBuilder d = new StringBuilder("Hello");    //String 1
        StringBuilder e = new StringBuilder(" World");    //String 2
        StringBuilder f = d.append(e);   //String 3 to store the result
        System.out.println(f.toString());  //Hello World


    }
}

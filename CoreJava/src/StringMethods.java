public class StringMethods {
    public static void main(String[] args) {
        String s = "learning java";
        String c = "LEARNING JAVA";
        String t = "avaj";
        String u = "upskilling java";

        System.out.println("format"+"--"+s.format("i am  %s %s",s,c));
        System.out.println("chartAt"+"--"+s.charAt(3));//r
        System.out.println("contains"+"--"+s.contains("java"));//true
        System.out.println("startsWith"+"--"+s.startsWith("java"));//false
        System.out.println("endsWith"+"--"+s.endsWith("java"));//true
        System.out.println("equals"+"--"+s.equals(t));//false
        System.out.println("compareTo"+"--"+s.compareTo(t));//11
        System.out.println("equalsIgnoreCase"+"--"+s.equalsIgnoreCase(c));//true
        System.out.println("compareToIgnoreCase"+"--"+s.compareToIgnoreCase(c));//0
        System.out.println("indexOf"+"--"+s.indexOf("j"));//9
        System.out.println("isEmpty"+"--"+s.isEmpty());//false
        System.out.println("lastIndexOf"+"--"+s.lastIndexOf("a"));//12
        System.out.println("length"+"--"+s.length());//13
        System.out.println("replace"+"--"+s.replace("l","a"));//aearning java
        System.out.println("substring"+"--"+s.substring(3));//rning java
        System.out.println("substring"+"--"+s.substring(3,6));//rni
        System.out.println("toUpperCase"+"--"+s.toUpperCase());//LEARNING JAVA
        System.out.println("toLowerCase"+"--"+s.toLowerCase());//learning java
        System.out.println("trim"+"--"+s.trim());//learning java
        System.out.println("valueOf"+"--"+s.valueOf(s));//learning java
        System.out.println("join"+"--"+s.join("/",s,t));//learning java/avaj

        System.out.println("codePointAt"+"--"+s.codePointAt(2));//97
        System.out.println("codePointBefore"+"--"+s.codePointBefore(2));//101
        System.out.println("intern"+"--"+s.intern());
        System.out.println("replaceAll"+"--"+s.replaceAll("l","m"));//mearning java
        System.out.println("split"+"--"+s.split("\\s"));
        System.out.println("toCharArray"+"--"+s.toCharArray());
        System.out.println("toString"+"--"+s.toString());//learning java

        StringBuilder str=new StringBuilder("deepak");
        System.out.println("append"+"--"+str.append(s));


        //s.codePointCount(2);
        //s.contentEquals();
        //s.copyValueOf();
        //s.getBytes();
        //s.getChars();
        //s.offsetByCodePoints();
        //s.regionMatches();
        //s.replaceFirst();
        //s.subSequence();
    }
}

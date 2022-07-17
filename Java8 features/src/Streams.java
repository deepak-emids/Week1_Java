import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 7, 4, 5, 8, 3);
        System.out.println(list);

        //1.map
        List<Integer> map = list.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(map);

        //2.filter
        List<Integer> filter = list.stream().map(i -> i * i).filter(i -> i < 2).collect(Collectors.toList());
        System.out.println(filter);

        //3.reduce
        Optional<Integer> reduce = list.stream().reduce((sum, i) -> sum + i);
        System.out.println(reduce);

        //4.max
        Optional<Integer> max = list.stream().max((i, j) -> i > j ? 1 : -1);
        System.out.println(max);

        //5.min
        Optional<Integer> min = list.stream().min((i, j) -> i > j ? 1 : -1);
        System.out.println(min);

        //6.Sorted use
        List<Integer> collect8 = list.stream().sorted().collect(Collectors.toList());
        System.out.println("6.1-Sorted = " + collect8);

        List<Integer> collect7 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("6.2-Reverse Sorted = " + collect7);

        //7.Stream to sort objects
        List<Student> students = new ArrayList<>();
        students.add(new Student("rohani", 33, "RFP03"));
        students.add(new Student("Chandan", 22, "RFP01"));
        students.add(new Student("Chandan", 21, "RFP05"));
        students.add(new Student("Mohan", 18, "RFP04"));
        students.add(new Student("Rohan", 23, "RFP02"));

        System.out.println("7." + "" + "sorting objects using streams" +
                students
                        .stream()
                        .sorted(Comparator.comparing(Student::getName)
                                .thenComparing(Student::getAge))
                        .collect(Collectors.toList()));


        //8.Matching
        int[] arr2 = {1, 3, 43};
        boolean b = Arrays.stream(arr2).anyMatch(a -> (a & 1) == 0);
        System.out.println("8.1-any match-" + b);

        int[] arr3 = {2, 1, 3, 43};
        boolean b1 = Arrays.stream(arr3).peek(c -> System.out.println(c)).anyMatch(a -> (a & 1) == 0);
        System.out.println("8.2-any match-" + b1);

        int[] arr4 = {1, 3, 43};
        boolean b2 = Arrays.stream(arr4).peek(c -> System.out.println(c)).allMatch(a -> (a & 1) == 1);
        System.out.println("8.3-all match-" + b2);

        int[] arr5 = {1, 3, 43};
        boolean b3 = Arrays.stream(arr5).peek(c -> System.out.println(c)).noneMatch(a -> (a & 1) == 0);
        System.out.println("8.4-none match-" + b3);

        int[] arr8 = {1, 3, 43};
        int nothing_found = Arrays.stream(arr8).peek(c -> System.out.println(c)).findFirst().orElseThrow(() -> new NullPointerException("Nothing Found"));
        System.out.println("find first-" + nothing_found);

        //9.Unique using Stream reduce
        int[] arr1 = {1, 1, 2, 2, 8, 3, 8, 78, 78, 80, 80, 43, 43, 58, 58};

        int reduce1 = Arrays.stream(arr1).reduce(0, (a, d) -> a ^ d);
        System.out.println("9.1-Unique number using stream Reduce - " + reduce1);

        //9.Unique using distinct
        System.out.println("9.-unique using stream distinct");
        Arrays.stream(arr1).distinct().forEach(System.out::println);

    }
}

class Student {
    private String name;
    private Integer age;
    private String code;

    public Student(String name, Integer age, String code) {
        this.name = name;
        this.age = age;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", code='" + code + '\'' + '}';
    }
}
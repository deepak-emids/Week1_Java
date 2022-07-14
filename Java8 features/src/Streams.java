import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(list);

        //map
        List<Integer> map = list.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(map);

        //filter
        List<Integer> filter = list.stream().map(i -> i * i).filter(i -> i < 2).collect(Collectors.toList());
        System.out.println(filter);

        //reduce
        Optional<Integer> reduce = list.stream().reduce((sum, i) -> sum + i);
        System.out.println(reduce);

        //max
        Optional<Integer> max = list.stream().max((i, j) -> i > j ? 1 : -1);
        System.out.println(max);

        //min
        Optional<Integer> min = list.stream().min((i, j) -> i >j ? 1 : -1);
        System.out.println(min);


    }

}

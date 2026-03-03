import java.util.*;
import java.util.stream.Collectors;

public class GetTop3HighestNumbers {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> list2= list1.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println(list2);

    }
}

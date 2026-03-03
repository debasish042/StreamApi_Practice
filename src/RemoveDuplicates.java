import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,1,2,3,4,4,5,6,7);
        List<Integer> list2= list.stream()
                .distinct().collect(Collectors.toList());
        System.out.println(list2);

    }
}

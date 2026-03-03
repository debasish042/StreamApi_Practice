import java.util.*;
import java.util.stream.Collectors;

public class FinfDuplicates {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,7);
        Set<Integer> set = new HashSet<>();

        Set<Integer> duplicates= list.stream()
                .filter(i->!set.add(i))
                .collect(Collectors.toSet());

        System.out.println(duplicates);

    }
}

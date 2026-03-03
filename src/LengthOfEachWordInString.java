import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LengthOfEachWordInString {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Java","Raja","Debasish");

        Map<String,Integer> map= list.stream()
                .collect(Collectors.toMap(Function.identity(),String::length));
        System.out.println(map);

        Map<String,Long> map1= list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map1);

    }
}

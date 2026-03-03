import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElement {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,2,3,3,4,5,5,5,7);

        Map<Integer,Long> map= list.stream()
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));

        map.forEach((k,v)->System.out.println(k+"="+v));

    }
}

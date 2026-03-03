import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCase {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Raja","Goldy","Debasish","saiPriya");

        List<String> list2= list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list2);
    }
}

import java.util.*;
public class LongestString {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Raja","Debasish","Goldy","SaiPriya","Java");

        String longest= list.stream().max(Comparator.comparing(String::length)).orElse(null);
        System.out.println(longest);
    }
}

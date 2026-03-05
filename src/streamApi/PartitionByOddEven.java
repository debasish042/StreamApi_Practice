package streamApi;

import java.util.*;
import java.util.stream.Collectors;
public class PartitionByOddEven {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean,List<Integer>> map=list.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println("Even numbers are:"+map.get(true));
        System.out.println("Odd numbers are:"+map.get(false));

    }
}

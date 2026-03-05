package streamApi;

import java.util.*;
import java.util.stream.Collectors;

public class CommonElementBetweenTwoLists {
    public static void main(String[] args) {

        List<Integer> list1=Arrays.asList(1,2,3,4,5);
        List<Integer> list2= Arrays.asList(4,5,6,7,8);

        Set<Integer> set=new HashSet<>(list2);

        List<Integer> commonElements= list1.stream()
                .filter(set::contains)
                .collect(Collectors.toList());
        System.out.println(commonElements);

        List<Integer> elementInList1=list1.stream()
                .filter(n->!set.contains(n))
                .collect(Collectors.toList());
        System.out.println(elementInList1);

    }
}

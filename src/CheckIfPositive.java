import java.util.*;
public class CheckIfPositive {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);

        boolean isPositive= list.stream().allMatch(n->n>0);
        System.out.println(isPositive);
    }
}

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNullValues {
    public static void main(String[] args) {
        List<String>  list = Arrays.asList("hello",null,"","world");

        List<String> list2= list.stream()
                .filter(Objects::nonNull)
                .filter(s->!s.isBlank())
                .collect(Collectors.toList());
        System.out.println(list2);

    }
}

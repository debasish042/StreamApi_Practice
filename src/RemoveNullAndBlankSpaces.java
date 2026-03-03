import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNullAndBlankSpaces {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "World",null,"");

        List<String> list2= list.stream()
                .filter(Objects::nonNull)
                .filter(s->!s.isBlank())
                .sorted()
                .map(String::toUpperCase)

                .collect(Collectors.toList());
        System.out.println(list2);
    }
}

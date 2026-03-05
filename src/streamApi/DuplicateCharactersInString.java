package streamApi;

import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String str= "Debasishsahu";


          Set<Character> duplicates= str.chars()
                  .mapToObj(c->(char)c)
                  .filter(c->str.indexOf(c)!=str.lastIndexOf(c))
                  .collect(Collectors.toSet());
          System.out.println(duplicates);
    }
}

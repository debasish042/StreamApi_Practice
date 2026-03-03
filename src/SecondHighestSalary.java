import java.util.Arrays;
import java.util.List;
import java.util.*;

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> empList= Arrays.asList(
                new Employee("Debasish",1,89000,"developer","Bhubaneshwar"),
                new Employee("Raja",2,90000,"Admin","Bengaluru"),
                new Employee("SaiPriya",3,69000,"HR","Bhubaneshwar"),
                new Employee("Goldy",4,90000,"testing","Bengaluru"),
                new Employee("Devil",5,78000,"developer","Hyderabad")
        );

        Optional<Double> secondHighest = empList.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst();
        System.out.println(secondHighest);

        empList.stream()
                .filter(e->e.getSalary()==secondHighest.get())
                .forEach(System.out::println);
    }
}

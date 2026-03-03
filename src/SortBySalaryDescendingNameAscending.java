import java.util.*;
import java.util.stream.Collectors;

public class SortBySalaryDescendingNameAscending {
    public static void main(String[] args) {

        List<Employee> empList= Arrays.asList(
                new Employee("Debasish",1,89000,"developer","Bhubaneshwar"),
                new Employee("Raja",2,90000,"Admin","Bengaluru"),
                new Employee("SaiPriya",3,69000,"HR","Bhubaneshwar"),
                new Employee("Goldy",4,90000,"testing","Bengaluru"),
                new Employee("Devil",5,78000,"developer","Hyderabad")
        );

       List<Employee> list3= empList.stream()
               .sorted(
                       Comparator.comparing(Employee::getDepartment).reversed()
                               .thenComparing(Comparator.comparing(Employee::getSalary).reversed())
                               .thenComparing(Employee::getName)
               ).collect(Collectors.toList());
       list3.forEach(System.out::println);
    }
}

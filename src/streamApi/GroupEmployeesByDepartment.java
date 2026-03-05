package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByDepartment {
    public static void main(String[] args) {
        List<Employee> empList= Arrays.asList(
                new Employee("Debasish",1,89000,"developer","Bhubaneshwar"),
                new Employee("Raja",2,90000,"Admin","Bengaluru"),
                new Employee("SaiPriya",3,69000,"HR","Bhubaneshwar"),
                new Employee("Goldy",4,90000,"testing","Bengaluru"),
                new Employee("Devil",5,78000,"developer","Hyderabad")
        );

        Map<String,List<Employee>> map= empList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        map.forEach((department,employee)->System.out.println(department+"="+employee));

    }
}

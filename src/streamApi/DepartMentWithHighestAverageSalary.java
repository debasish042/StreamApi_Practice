package streamApi;

import java.util.*;
import java.util.stream.Collectors;

public class DepartMentWithHighestAverageSalary {
    public static void main(String[] args) {
        List<Employee> empList= Arrays.asList(
                new Employee("Debasish",1,89000,"developer","Bhubaneshwar"),
                new Employee("Raja",2,90000,"Admin","Bengaluru"),
                new Employee("SaiPriya",3,69000,"HR","Bhubaneshwar"),
                new Employee("Goldy",4,90000,"testing","Bengaluru"),
                new Employee("Devil",5,78000,"developer","Hyderabad")
        );
        Map<String,Double> map = empList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        map.forEach((department,salary)->System.out.println(department+"="+salary));

        String department= map.entrySet().stream()
                .max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println(department);
    }
}

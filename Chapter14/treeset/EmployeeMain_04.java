package treeset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain_04 {
    public static void main(String[] args) {

        List<Employee> employee = new ArrayList<Employee>();

        employee.add(new Employee("Alice", 20));
        employee.add(new Employee("Brad", 22));
        employee.add(new Employee("Charlie", 23));
        // 이름 기준
        Collections.sort(employee, new NameComparator());

        for (Employee employees : employee) {

            System.out.println(employees);
        }
        // 나이 기준
        Collections.sort(employee, new AgeComparator());

        for (Employee employees : employee) {

            System.out.println(employees);
        }
    }
}

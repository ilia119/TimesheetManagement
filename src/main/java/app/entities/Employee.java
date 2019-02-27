package app.entities;

import java.util.LinkedList;
import java.util.List;

public class Employee {

    private final String name;

    private static List<Employee> employees = new LinkedList<>();

    static {
        employees.add(new Employee("Yuri Dolgushev"));
        employees.add(new Employee("Alena Chuvasova"));
        employees.add(new Employee("Igor Kraskovskii"));
        employees.add(new Employee("Kiryl Shalpuk"));
        employees.add(new Employee("Kiryl Honcharov"));
        employees.add(new Employee("Ilia Goroshko"));
        employees.add(new Employee("Maxim Tkachenko"));
        employees.add(new Employee("Nikita Ersov"));
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<Employee> getAll() {
        return employees;
    }
}

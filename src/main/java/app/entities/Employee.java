package app.entities;

import java.util.LinkedList;
import java.util.List;

public class Employee {

    private final int id;
    private final String name;
    private final String photo;
    private final String email;


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
        this.id = 0;
        this.name = name;
        this.photo = null;
        this.email = null;
    }

    public Employee(int id, String name, String photo, String email) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public static List<Employee> getAll() {
        return employees;
    }
}

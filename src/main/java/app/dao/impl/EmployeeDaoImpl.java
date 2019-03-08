package app.dao.impl;

import app.dao.EmployeeDao;
import app.entities.Employee;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    private static List<Employee> employees = new LinkedList<>();

    static {
        employees.add(new Employee(0, "Marinka Mandarinka",
                "someMarinkaPhotoUrl", "marinka.mandarinka@gmail.com"));
        employees.add(new Employee(1, "Alynka Apelsynka",
                "someAlynkaPhotoUrl", "alynka.apelsynka@gmail.com"));
        employees.add(new Employee(2, "Agap Kryvolap",
                "someAgapPhotoUrl", "agap.kryvolap@gmail.com"));
    }

    @Override
    public synchronized List<Employee> getAll() {
        return employees;
    }

    @Override
    public synchronized Employee findById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        throw new IllegalArgumentException("No employee by id=" + id);
    }

    @Override
    public synchronized void save(Employee employee) {
        employees.add(employee);
    }

    @Override
    public synchronized void delete(Employee retiringEmployee) {
        for (Employee employee : employees) {
            if (employee.equals(retiringEmployee)) {
                employees.remove(retiringEmployee);
                return;
            }
        }
    }

    @Override
    public synchronized void edit(Employee employee) {
        int index = employees.indexOf(findById(employee.getId()));
        employees.remove(index);
        employees.add(index, employee);
    }
}

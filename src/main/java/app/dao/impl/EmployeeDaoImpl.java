package app.dao.impl;

import app.dao.EmployeeDao;
import app.entities.Employee;
import app.exceptions.EmployeeNotFoundException;

import java.util.LinkedList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private static List<Employee> employees = new LinkedList<>();

    static {

    }


    @Override
    public Employee findById(int id) {
        try {
            for (Employee employee : employees) {
                if (employee.getId() == id) {
                    return employee;
                }
            }
            throw new EmployeeNotFoundException("No employee by id = " + id, id);
        } catch (EmployeeNotFoundException exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Override
    public void save(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void delete(Employee employee) {
        employees.remove(employee);
    }
}

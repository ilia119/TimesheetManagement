package app.dao.impl;

import app.dao.EmployeeDao;
import app.dao.exceptions.exist.extensions.EmployeeNonExistException;
import app.dao.exceptions.id.extensions.EmployeeNotFoundByIdException;
import app.entities.Employee;

import java.util.LinkedList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private static List<Employee> employees = new LinkedList<>();

    static {

    }
    
    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public Employee findById(int id) {
        try {
            for (Employee employee : employees) {
                if (employee.getId() == id) {
                    return employee;
                }
            }
            throw new EmployeeNotFoundByIdException("No employee by id = "
                    + id, id);
        } catch (EmployeeNotFoundByIdException exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Override
    public void save(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void delete(Employee retiringEmployee) {
        try {
            for (Employee employee : employees) {
                if (employee.equals(retiringEmployee)) {
                    employees.remove(retiringEmployee);
                    return;
                }
            }
            throw new EmployeeNonExistException("Not exist this employee: "
                    + retiringEmployee.toString(), retiringEmployee);
        } catch (EmployeeNonExistException exception) {
            exception.printStackTrace();
        }
    }
}

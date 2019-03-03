package app.server.service.impl;

import app.server.dao.EmployeeDao;
import app.server.entities.Employee;
import app.server.entities.Project;
import app.server.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public void assignToProject(Employee employee, Project project) {
        employee.assignToProject(project);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeDao.getAll();
    }

    @Override
    public Employee findById(int id) {
        return employeeDao.findById(id);
    }

    @Override
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        employeeDao.delete(employee);
    }
}

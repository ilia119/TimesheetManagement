package app.service.impl;

import app.dao.EmployeeDao;
import app.entities.Employee;
import app.entities.Project;
import app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public void assignToProject(Employee employee, Project project) {

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

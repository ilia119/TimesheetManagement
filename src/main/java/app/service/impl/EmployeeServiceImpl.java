package app.service.impl;

import app.dao.EmployeeDao;
import app.dao.factory.FactoryDao;
import app.entities.Employee;
import app.entities.Project;
import app.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao =
            FactoryDao.getInstance().getEmployeeDao();

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

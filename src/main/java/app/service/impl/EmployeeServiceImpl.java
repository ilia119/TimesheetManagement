package app.service.impl;

import app.dao.factory.FactoryDao;
import app.entities.Employee;
import app.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public Employee findById(int id) {
        return FactoryDao.getInstance().getEmployeeDao().findById(id);
    }

    @Override
    public void save(Employee employee) {
        FactoryDao.getInstance().getEmployeeDao().save(employee);
    }

    @Override
    public void delete(Employee employee) {
        FactoryDao.getInstance().getEmployeeDao().delete(employee);
    }
}

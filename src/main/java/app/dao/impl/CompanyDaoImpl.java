package app.dao.impl;

import app.dao.CompanyDao;
import app.entities.Company;
import app.dao.exceptions.id.extensions.CompanyNotFoundByIdException;

import java.util.LinkedList;
import java.util.List;

public class CompanyDaoImpl implements CompanyDao {

    private static List<Company> companies = new LinkedList<>();

    static {
        companies.add(
                new Company(0, "Horn&Hooves", "someHornAndHoovesUrl"));
        companies.add(
                new Company(1, "Warm&Cold", "someWarmAndColdUrl"));
    }

    @Override
    public List<Company> getAll(){
        return companies;
    }

    @Override
    public Company findById(int id) {
        try {
            for (Company company : companies) {
                if (company.getId() == id) {
                    return company;
                }
            }
            throw new CompanyNotFoundByIdException("No company found by id = " + id, id);
        } catch (CompanyNotFoundByIdException exception){
            exception.printStackTrace();
        }
        return null;
    }

    @Override
    public void save(Company company) {
        companies.add(company);
    }

    @Override
    public void delete(Company company) {
        companies.remove(company);
    }
}

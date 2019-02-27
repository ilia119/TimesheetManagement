package app.dao.impl;

import app.dao.CompanyDao;
import app.entities.Company;

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
    public Company findById(int id) {
        return companies.get(id);
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

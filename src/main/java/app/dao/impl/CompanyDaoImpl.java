package app.dao.impl;

import app.dao.CompanyDao;
import app.entities.Company;
import app.exceptions.EntityNotFound;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class CompanyDaoImpl implements CompanyDao {

    private static List<Company> companies = new LinkedList<>();

    static {
        companies.add(
                new Company(0, "Horn&Hooves", "someHorn&HoovesUrl"));
    }

    @Override
    public synchronized List<Company> getAll() {
        return companies;
    }

    @Override
    public synchronized Company findById(int id) {
        for (Company company : companies) {
            if (company.getId() == id) {
                return company;
            }
        }
        throw new EntityNotFound();
    }

    @Override
    public synchronized void save(Company company) {
        companies.add(company);
    }

    @Override
    public synchronized void delete(Company retiringCompany) {
        for (Company company : companies) {
            if (company.equals(retiringCompany)) {
                companies.remove(retiringCompany);
                return;
            }
        }
    }

    @Override
    public synchronized void edit(Company company) {
        int index = companies.indexOf(findById(company.getId()));
        companies.remove(index);
        companies.add(index, company);
    }
}

package app.server.dao.impl;

import app.server.dao.CompanyDao;
import app.server.dao.exceptions.exist.extensions.CompanyNonExistException;
import app.server.dao.exceptions.id.extensions.CompanyNotFoundByIdException;
import app.server.entities.Company;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
@Qualifier("CompanyDaoImpl")
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
        try {
            for (Company company : companies) {
                if (company.getId() == id) {
                    return company;
                }
            }
            throw new CompanyNotFoundByIdException("No company found by id = "
                    + id, id);
        } catch (CompanyNotFoundByIdException exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Override
    public synchronized void save(Company company) {
        companies.add(company);
    }

    @Override
    public synchronized void delete(Company retiringCompany) {
        try {
            for (Company company : companies) {
                if (company.equals(retiringCompany)) {
                    companies.remove(retiringCompany);
                    return;
                }
            }
            throw new CompanyNonExistException("Not exist this company: "
                    + retiringCompany.toString(), retiringCompany);
        } catch (CompanyNonExistException exception) {
            exception.printStackTrace();
        }
    }
}

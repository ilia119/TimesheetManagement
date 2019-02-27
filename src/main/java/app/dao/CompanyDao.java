package app.dao;

import app.entities.Company;

import java.util.List;

public interface CompanyDao {

    List<Company> getCompanies();

    Company findById(int id);

    void save(Company company);

    void delete(Company company);
}

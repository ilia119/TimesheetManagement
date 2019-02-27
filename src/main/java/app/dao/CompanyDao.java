package app.dao;

import app.entities.Company;

public interface CompanyDao {

    Company findById(int id);

    void save(Company company);

    void delete(Company company);
}

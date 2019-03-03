package app.server.dao;

import app.server.entities.Company;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CompanyDao {

    List<Company> getAll();

    Company findById(int id);

    void save(Company company);

    void delete(Company company);
}

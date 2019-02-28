package app.dao.exceptions.exist.extensions;

import app.dao.exceptions.exist.NonExistException;
import app.entities.Company;

public class CompanyNonExistException extends NonExistException {

    private Company company;

    public Company getCompany() {
        return company;
    }

    public CompanyNonExistException(String message, Company company) {
        super(message);
        this.company = company;
    }

}

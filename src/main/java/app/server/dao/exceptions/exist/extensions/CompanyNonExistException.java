package app.server.dao.exceptions.exist.extensions;

import app.server.dao.exceptions.exist.NonExistException;
import app.server.entities.Company;

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

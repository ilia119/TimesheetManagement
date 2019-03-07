package app.client;


import app.server.entities.Company;
import app.server.entities.Employee;
import app.server.entities.Logs;
import app.server.entities.Project;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public class RestClient {

    private static final String COMPANY_URI
            = "http://localhost:4848/spring-intro-task/company";
    private static final String EMPLOYEE_URI
            = "http://localhost:4848/spring-intro-task/employee";
    private static final String PROJECT_URI
            = "http://localhost:4848/spring-intro-task/project";
    private static final String LOGS_URI
            = "http://localhost:4848/spring-intro-task/logs";
    private static final String ADD = "add/";

    private Client client = ClientBuilder.newClient();


    public Response createJsonCompany(Company company) {
        return client
                .target(COMPANY_URI).path(ADD)
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(company, MediaType.APPLICATION_JSON));
    }


    public Company getJsonCompany(int id) {
        return client.target(COMPANY_URI).path(String.valueOf(id))
                .request(MediaType.APPLICATION_JSON).get(Company.class);
    }

    public Response createJsonEmployee(Employee employee) {
        return client
                .target(EMPLOYEE_URI).path(ADD)
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(employee, MediaType.APPLICATION_JSON));
    }

    public Employee getJsonEmployee(int id) {
        return client.target(EMPLOYEE_URI).path(String.valueOf(id))
                .request(MediaType.APPLICATION_JSON).get(Employee.class);
    }

    public Response createJsonProject(Project project) {
        return client
                .target(PROJECT_URI).path(ADD)
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(project, MediaType.APPLICATION_JSON));
    }

    public Project getJsonProject(int id) {
        return client.target(PROJECT_URI).path(String.valueOf(id))
                .request(MediaType.APPLICATION_JSON).get(Project.class);
    }

    public Response createJsonProject(Logs logs) {
        return client
                .target(LOGS_URI).path(ADD)
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(logs, MediaType.APPLICATION_JSON));
    }


}

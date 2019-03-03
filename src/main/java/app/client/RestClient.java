package app.client;


import app.server.entities.Company;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public class RestClient {

    private static final String REST_URI
            = "http://localhost:8080/spring_intro_task_Web_exploded/company";
    private static final String REST_ADD
            = "add/";

    private Client client = ClientBuilder.newClient();


    public Response createJsonCompany(Company company) {
        return client
                .target(REST_URI).path(REST_ADD)
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(company, MediaType.APPLICATION_JSON));
    }

    public Company getJsonCompany(int id) {
        return client.target(REST_URI).path(String.valueOf(id))
                .request(MediaType.APPLICATION_JSON).get(Company.class);
    }

    public Response createXmlCompany(Company company) {
        return client.target(REST_URI).request(MediaType.APPLICATION_XML)
                .post(Entity.entity(company, MediaType.APPLICATION_ATOM_XML));
    }


}

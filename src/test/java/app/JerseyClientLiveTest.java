package app;

import app.client.RestClient;
import app.server.entities.Company;
import org.junit.Test;

import javax.ws.rs.core.Response;

import static junit.framework.TestCase.assertEquals;

public class JerseyClientLiveTest {

    public static final int HTTP_CREATED = 201;
    private RestClient client = new RestClient();

    @Test
    public void givenCorrectObject_whenCorrectJsonRequest_thenResponseCodeCreated() {

        Company company = new Company(23, "tat", "tasrs");

        Response response = client.createJsonCompany(company);

        assertEquals(response.getStatus(), HTTP_CREATED);
    }
}

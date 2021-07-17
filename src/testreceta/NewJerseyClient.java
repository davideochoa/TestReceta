/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testreceta;

import jakarta.ws.rs.ClientErrorException;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import java.text.MessageFormat;


/**
 * Jersey REST client generated for REST resource:ExistenciaExterna
 * [ExistenciaExterna]<br>
 * USAGE:
 * <pre>
 *        NewJerseyClient client = new NewJerseyClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Usuario
 */
public class NewJerseyClient {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/Receta/webresources";

    public NewJerseyClient() {
        client = ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("ExistenciaExterna");
    }

    public <T> T buscarExistencia(Class<T> responseType, String IdSurtidor, String clave) throws ClientErrorException {
        return webTarget.path(MessageFormat.format("buscarExistencia/{0}/{1}", new Object[]{IdSurtidor, clave})).request().post(null, responseType);
    }

    public <T> T agregarExistencia(Object requestEntity, Class<T> responseType) throws ClientErrorException {
        return webTarget.path("agregarExistencia").request(MediaType.APPLICATION_JSON).post(Entity.entity(requestEntity, MediaType.APPLICATION_JSON), responseType);
    }

    public <T> T listarExistencias(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("listarExistencias");
        return resource.request(MediaType.APPLICATION_JSON).get(responseType);
    }

    public void close() {
        client.close();
    }
    
}

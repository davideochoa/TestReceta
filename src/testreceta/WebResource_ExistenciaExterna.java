/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testreceta;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import java.text.MessageFormat;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class WebResource_ExistenciaExterna {
    WebTarget webTarget;
    WebTarget resource;
    public WebResource_ExistenciaExterna() {
        Client client = ClientBuilder.newClient();        
        webTarget = client.target("http://localhost:8080/Receta/webresources/ExistenciaExterna");         
    }
    
    public List<RegistroExistencia> listarExistencia(){        
        resource = webTarget;        
        List<RegistroExistencia> bitacora = resource.path("listarExistencias")
                                                    .request(MediaType.APPLICATION_JSON)
                                                    .get(new GenericType<List<RegistroExistencia>>(){});       
        return bitacora;
    }
    
    public List<RegistroExistencia> agregarExistencia(RegistroExistencia re){
        resource = webTarget;
        List<RegistroExistencia> bitacora = resource.path("agregarExistencia")
                                                    .request(MediaType.APPLICATION_JSON)
                                                    .put(Entity.entity(re, MediaType.APPLICATION_JSON),new GenericType<List<RegistroExistencia>>(){});
        return bitacora;
    }
    
    public RegistroExistencia buscarExistencia(int IdSurtidor,String clave){        
        resource = webTarget;
        RegistroExistencia re = resource.path(MessageFormat.format("buscarExistencia/{0}/{1}", new Object[]{IdSurtidor, clave}))
                                                            .request()
                                                            .post(null, new GenericType<RegistroExistencia>(){});       
        return re;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testreceta;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
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
    
    public List<RegistroExistenciaCLI> listarExistencia(){        
        resource = webTarget;        
        
        List<RegistroExistenciaCLI> bitacora = resource.path("listarExistencias")
                                                    .request(MediaType.APPLICATION_JSON)
                                                    .get(new GenericType<List<RegistroExistenciaCLI>>(){});       
        return bitacora;
    }
    
    public List<RegistroExistenciaCLI> agregarExistencia(RegistroExistenciaCLI re){
        resource = webTarget;
        List<RegistroExistenciaCLI> bitacora = resource.path("agregarExistencia")
                                                    .request(MediaType.APPLICATION_JSON)
                                                    .put(Entity.entity(re, MediaType.APPLICATION_JSON),new GenericType<List<RegistroExistenciaCLI>>(){});
        return bitacora;
    }
    
    public RegistroExistenciaCLI buscarExistencia(int IdSurtidor,String clave){        
        resource = webTarget;
        RegistroExistenciaCLI re = resource.path(MessageFormat.format("buscarExistencia/{0}/{1}", new Object[]{IdSurtidor, clave}))
                                                            .request()
                                                            .post(null, new GenericType<RegistroExistenciaCLI>(){});       
        return re;
    }
}

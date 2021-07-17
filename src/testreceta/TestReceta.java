/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testreceta;

import jakarta.json.Json;
import jakarta.json.JsonObject;
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
public class TestReceta {

    public TestReceta() {
                
        Client client = ClientBuilder.newClient();
        
        WebTarget webTarget = client.target("http://localhost:8080/Receta/webresources").path("ExistenciaExterna");  
        
        //*********** LISTAR EXISTENCIAS ***************************
        System.out.println("******************** LISTAR EXISTENCIAS *********************");
        WebTarget resource = webTarget;
        resource = resource.path("listarExistencias");        
        //System.out.println(resource.getUri().getPath());
        
        List<RegistroExistencia> bitacora = resource.request(MediaType.APPLICATION_JSON).get(new GenericType<List<RegistroExistencia>>(){});
        
        for(RegistroExistencia p: bitacora) { 
            System.out.println(p.getIdSurtidor());
            System.out.println(p.getClave());
            System.out.println(p.getCantidad());
        }
        
        // ******************** AGREGAR EXISTENCIAS **********************
        System.out.println("******************** AGREGAR EXISTENCIAS *********************");
        resource = webTarget;
        resource = resource.path("agregarExistencia");
        //System.out.println(resource.getUri().getPath());
        
        RegistroExistencia re = new RegistroExistencia();
        re.setIdSurtidor(4);
        re.setClave("104");
        re.setCantidad(40);
        
        bitacora = resource.request(MediaType.APPLICATION_JSON)
                                    .post(Entity.entity(re, MediaType.APPLICATION_JSON),
                                            new GenericType<List<RegistroExistencia>>(){});
        
        for(RegistroExistencia p: bitacora) { 
            System.out.println(p.getIdSurtidor());
            System.out.println(p.getClave());
            System.out.println(p.getCantidad());
        }
        
        //*********** BUSCAR EXISTENCIA *****************
        System.out.println("******************** BUSCAR EXISTENCIA *********************");
        int IdSurtidor = 3;
        String clave = "103";
        
        resource = webTarget;
        resource = resource.path(MessageFormat.format("buscarExistencia/{0}/{1}", new Object[]{IdSurtidor, clave}));
                
        re = resource.request().post(null, new GenericType<RegistroExistencia>(){});
        System.out.println(re.getIdSurtidor());
        System.out.println(re.getClave());
        System.out.println(re.getCantidad());
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new TestReceta();
    }
    
}

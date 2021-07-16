/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testreceta;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Usuario
 */
public class TestReceta {

    public TestReceta() {
                
        Client client = ClientBuilder.newClient();
        
        WebTarget webTarget = client.target("http://localhost:8080/Receta/webresources").path("ExistenciaExterna");  
        
        WebTarget resource = webTarget;
        resource = resource.path("listarExistencias");
        
        List<RegistroExistencia> bitacora = resource.request(MediaType.APPLICATION_JSON).get(new GenericType<List<RegistroExistencia>>(){});
        
        for(RegistroExistencia p: bitacora) {
 
            System.out.println(p.getIdSurtidor());
            System.out.println(p.getClave());
            System.out.println(p.getCantidad());
        }
        
        
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new TestReceta();
    }
    
}

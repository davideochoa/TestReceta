/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testreceta;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation.Builder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class TestReceta {
    public TestReceta() { 
        WebResource_ExistenciaExterna WR_EE = new WebResource_ExistenciaExterna();
        
        System.out.println("******************** LISTAR EXISTENCIAS *********************");        
        List<RegistroExistencia> bitacora = WR_EE.listarExistencia();
        
        for(RegistroExistencia p: bitacora) { 
            System.out.println(p.getIdSurtidor()+" : "+p.getClave()+" : "+p.getCantidad());
        }
        
        /*
        System.out.println();
        System.out.println("******************** AGREGAR EXISTENCIAS *********************");
        RegistroExistencia re = new RegistroExistencia();
        re.setIdSurtidor(6);
        re.setClave("106");
        re.setCantidad(60);
        
        bitacora = WR_EE.agregarExistencia(re);
        for(RegistroExistencia p: bitacora) { 
            System.out.println(p.getIdSurtidor()+" : "+p.getClave()+" : "+p.getCantidad());
        }
        */
        RegistroExistencia re = new RegistroExistencia();
        System.out.println();
        System.out.println("******************** BUSCAR EXISTENCIA *********************");
        re = WR_EE.buscarExistencia(5,"105");
        System.out.println(re.getIdSurtidor()+" : "+re.getClave()+" : "+re.getCantidad());
    }
    
    public static void main(String[] args) {
        new TestReceta();
    }
    
}

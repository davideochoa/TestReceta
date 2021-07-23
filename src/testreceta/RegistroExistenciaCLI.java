/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testreceta;

import java.sql.Date;
import org.joda.time.LocalDate;

public class RegistroExistenciaCLI {
    private int idSurtidor = 0;
    private String clave = "";
    private int cantidad  = 0;
    private LocalDate fecha;
    public RegistroExistenciaCLI() {}
        
    public RegistroExistenciaCLI(int idSurtidor, String clave, int cantidad) {
        this.setIdSurtidor(idSurtidor);
        this.setClave(clave);
        this.setCantidad(cantidad);
    }
    
    public RegistroExistenciaCLI(int idSurtidor, String clave, int cantidad,long time) {
        this.setIdSurtidor(idSurtidor);
        this.setClave(clave);
        this.setCantidad(cantidad);
        this.setFecha(new LocalDate(time));
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        //SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyyy HH:mm:ss");
        this.fecha = fecha;
    }

    public int getIdSurtidor() {
        return idSurtidor;
    }

    public void setIdSurtidor(int idSurtidor) {
        this.idSurtidor = idSurtidor;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}

package testreceta;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class RegistroExistenciaCLI {
    private int idSurtidor = 0;
    private String clave = "";
    private int cantidad  = 0;
    @XmlJavaTypeAdapter(value = TimestampAdapter.class, type = Timestamp.class)
    private Timestamp fecha;
    public RegistroExistenciaCLI() {}
        
    public RegistroExistenciaCLI(int idSurtidor, String clave, int cantidad) {
        this.setIdSurtidor(idSurtidor);
        this.setClave(clave);
        this.setCantidad(cantidad);
    }
    
    public RegistroExistenciaCLI(int idSurtidor, String clave, int cantidad,Timestamp timestamp) {
        this.setIdSurtidor(idSurtidor);
        this.setClave(clave);
        this.setCantidad(cantidad);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyyy HH:mm:ss");        
        this.setFecha(timestamp);
    }
    
    @XmlJavaTypeAdapter(value = TimestampAdapter.class, type = Timestamp.class)
    public Timestamp getFecha() {
        return fecha;
    }
    
    @XmlJavaTypeAdapter(value = TimestampAdapter.class, type = Timestamp.class)
    public void setFecha(Timestamp timestamp) {
        this.fecha = (Timestamp) timestamp.clone();
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


package pe.edu.pucp.losheredados.usuarios;

import pe.edu.pucp.losheredados.usuarios.Trabajador;
import java.util.Date;


public class ContactoCliente {
    private Date tiempoContacto;
    private Trabajador trabajador;
    private String descripcion;

    public ContactoCliente(Date tiempoContacto, Trabajador trabajador, String descripcion) {
        this.tiempoContacto = tiempoContacto;
        this.trabajador = trabajador;
        this.descripcion = descripcion;
    }

    public Date getTiempoContacto() {
        return tiempoContacto;
    }

    public void setTiempoContacto(Date tiempoContacto) {
        this.tiempoContacto = tiempoContacto;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}

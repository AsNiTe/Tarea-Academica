
package pe.edu.pucp.losheredados.usuarios;
import pe.edu.pucp.losheredados.usuarios.Trabajador;
import java.util.Date;

public class VisitaObra {
    private Date tiempoVisita;
    private Trabajador trabajador;
    private String descripcion;

    public VisitaObra(Date tiempoVisita, Trabajador trabajador, String descripcion) {
        this.tiempoVisita = tiempoVisita;
        this.trabajador = trabajador;
        this.descripcion = descripcion;
    }

    public Date getTiempoVisita() {
        return tiempoVisita;
    }

    public void setTiempoVisita(Date tiempoVisita) {
        this.tiempoVisita = tiempoVisita;
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

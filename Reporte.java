import java.util.Date;

public class Reporte {
    private String nombre;
    private String descripcion;
    private Date  fechaGeneracion;

    public Reporte(String nombre, String descripcion, Date fechaGeneracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
 
   }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }
    
}
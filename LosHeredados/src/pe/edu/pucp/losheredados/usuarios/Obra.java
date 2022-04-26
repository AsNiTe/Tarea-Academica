package pe.edu.pucp.losheredados.usuarios;
import pe.edu.pucp.losheredados.usuarios.VisitaObra;
import pe.edu.pucp.losheredados.usuarios.Trabajador;
import pe.edu.pucp.losheredados.usuarios.Ubigeo;
import pe.edu.pucp.losheredados.usuarios.Cliente;
import java.util.ArrayList;
import java.util.Date;
public class Obra{
	private String estado;
	private Cliente encargado;
	private ArrayList<Trabajador> personalEncargado;
	private Ubigeo zona;
	private String direccion;
        private ArrayList<VisitaObra> visitas; 
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Cliente getEncargado() {
		return encargado;
	}
	public void setEncargado(Cliente encargado) {
		this.encargado = encargado;
	}

	public Ubigeo getZona() {
		return zona;
	}
	public void setZona(Ubigeo zona) {
		this.zona = zona;
	}

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

        public ArrayList<Trabajador> getPersonalEncargado() {
            return personalEncargado;
        }

        public void setPersonalEncargado(ArrayList<Trabajador> personalEncargado) {
            this.personalEncargado = personalEncargado;
        }

        public ArrayList<VisitaObra> getVisitas() {
            return visitas;
        }

        public void setVisitas(ArrayList<VisitaObra> visitas) {
            this.visitas = visitas;
        }

        public Obra(String estado, Cliente encargado, ArrayList<Trabajador> personalEncargado, Ubigeo zona, String direccion, ArrayList<VisitaObra> visitas) {
            this.estado = estado;
            this.encargado = encargado;
            this.personalEncargado = personalEncargado;
            this.zona = zona;
            this.direccion = direccion;
            this.visitas = visitas;
        }
        
        
	

	
}

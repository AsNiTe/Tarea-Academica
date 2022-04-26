package pe.edu.pucp.losheredados.usuarios.model;
import java.util.Date;
import java.util.ArrayList;
public class Cliente extends Usuario{
        private String RUC;
	private String razonSocial;
	private String personaContacto;
	private Cliente_Categoria categoria;
	private ArrayList<Obra> obra;
        private ArrayList<ContactoCliente> contactos;
        private double deudaPendienteTotal;
        private double deudaVencidas;

        public String getRUC() {
            return RUC;
        }

        public void setRUC(String RUC) {
            this.RUC = RUC;
        }

        public ArrayList<ContactoCliente> getContactos() {
            return contactos;
        }

        public void setContactos(ArrayList<ContactoCliente> contactos) {
            this.contactos = contactos;
        }

        public double getDeudaPendienteTotal() {
            return deudaPendienteTotal;
        }

        public void setDeudaPendienteTotal(double deudaPendienteTotal) {
            this.deudaPendienteTotal = deudaPendienteTotal;
        }

        public double getDeudaVencidas() {
            return deudaVencidas;
        }

        public void setDeudaVencidas(double deudaVencidas) {
            this.deudaVencidas = deudaVencidas;
        }
    
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getPersonaContacto() {
		return personaContacto;
	}
	public void setPersonaContacto(String personaContacto) {
		this.personaContacto = personaContacto;
	}

	public Cliente_Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Cliente_Categoria categoria) {
		this.categoria = categoria;
	}

	public ArrayList<Obra> getObra() {
		return obra;
	}
	public void setObra(ArrayList<Obra> obra) {
		this.obra = obra;
	}

    public Cliente(String RUC, String razonSocial, String personaContacto, Cliente_Categoria categoria, ArrayList<Obra> obra, ArrayList<ContactoCliente> contactos, double deudaPendienteTotal, double deudaVencidas, String nombre, int telefono, String correo, Date fechaRegistro) {
        super(nombre, telefono, correo, fechaRegistro);
        this.RUC = RUC;
        this.razonSocial = razonSocial;
        this.personaContacto = personaContacto;
        this.categoria = categoria;
        this.obra = obra;
        this.contactos = contactos;
        this.deudaPendienteTotal = deudaPendienteTotal;
        this.deudaVencidas = deudaVencidas;
    }
        
	
}

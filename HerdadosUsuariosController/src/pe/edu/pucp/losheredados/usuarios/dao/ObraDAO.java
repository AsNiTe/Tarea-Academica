
package pe.edu.pucp.losheredados.usuarios.dao;

import java.util.ArrayList;
import pe.edu.pucp.losheredados.usuarios.model.Obra;


public interface ObraDAO {
       int insertar(Obra obra);
    int modificar(Obra obra);
    int eliminar(int idObra);
    ArrayList<Obra> listarTodas();
    Obra buscarPorId(int idObra); 
    
}

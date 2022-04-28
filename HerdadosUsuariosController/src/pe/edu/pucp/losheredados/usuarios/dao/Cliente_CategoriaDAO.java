
package pe.edu.pucp.losheredados.usuarios.dao;

import java.util.ArrayList;
import pe.edu.pucp.losheredados.usuarios.model.Cliente_Categoria;

/**
 *
 * @author JOSE
 */
public interface Cliente_CategoriaDAO {
    int insertar(Cliente_Categoria cliente_categoria);
    int modificar(Cliente_Categoria cliente_categoria);
    int eliminar(int idCliente_Categoria);
    ArrayList<Cliente_Categoria> listarTodas();
    Cliente_Categoria buscarPorId(int idCliente_Categoria);  
}

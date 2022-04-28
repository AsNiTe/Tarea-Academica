/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.losheredados.productos.dao;

import java.util.ArrayList;
import pe.edu.pucp.losheredados.productos.model.ProductoyCategoria;

/**
 *
 * @author Roberto Carlos
 */
public interface ProductoCategoriaDAO {
    int insertar(ProductoyCategoria productoCategoria);
    int modificar(ProductoyCategoria productoCategoria);
    int eliminar(int id_productoCategoria);
    ArrayList<ProductoyCategoria> listarTodos();
}

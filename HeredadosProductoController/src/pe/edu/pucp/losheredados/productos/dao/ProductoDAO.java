/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.losheredados.productos.dao;

import java.util.ArrayList;
import pe.edu.pucp.losheredados.productos.model.Producto;

/**
 *
 * @author Roberto Carlos
 */
public interface ProductoDAO {
    int insertarProducto(Producto producto);
    int modificar(Producto producto);
    int eliminar(int idProducto);
    ArrayList<Producto> listarTodos();
    Producto buscarPorId(int idProducto);
}

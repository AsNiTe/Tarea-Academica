/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.losheredados.productos.dao;

import java.util.ArrayList;
import pe.edu.pucp.losheredados.productos.model.Almacen;

/**
 *
 * @author Roberto Carlos
 */
public interface AlmacenDAO {
    int insertar(Almacen almacen);
    int modificar(Almacen almacen);
    int eliminar(int id_almacen);
    ArrayList<Almacen> listarTodos();
}

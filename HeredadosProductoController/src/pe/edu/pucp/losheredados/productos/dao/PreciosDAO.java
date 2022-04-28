/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.losheredados.productos.dao;

import java.util.ArrayList;
import pe.edu.pucp.losheredados.productos.model.Precios;

/**
 *
 * @author Roberto Carlos
 */
public interface PreciosDAO {
    int insertar(Precios precios);
    int modificar(Precios precios);
    int eliminar(int id_precios);
    ArrayList<Precios> listarTodos();
}

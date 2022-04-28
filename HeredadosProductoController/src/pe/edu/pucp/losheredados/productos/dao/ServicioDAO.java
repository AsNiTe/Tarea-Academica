/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.losheredados.productos.dao;

import java.util.ArrayList;
import pe.edu.pucp.losheredados.productos.model.Servicio;

/**
 *
 * @author Roberto Carlos
 */
public interface ServicioDAO {
    int insertar(Servicio servicio);
    int modificar(Servicio servicio);
    int eliminar(int id_servicio);
    ArrayList<Servicio> listarTodos();
}

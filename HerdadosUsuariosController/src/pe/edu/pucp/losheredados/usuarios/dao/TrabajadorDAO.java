/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.losheredados.usuarios.dao;

import java.util.ArrayList;
import pe.edu.pucp.losheredados.usuarios.model.Trabajador;

public interface TrabajadorDAO {
    int insertar(Trabajador trabajador);
    int modificar(Trabajador trabajador);
    int eliminar(int idTrabajador);
    ArrayList<Trabajador> listarTodas();
    Trabajador buscarPorId(int idTrabajador); 
    
}

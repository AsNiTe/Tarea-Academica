/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.losheredados.ventas.dao;

import java.util.ArrayList;
import pe.edu.pucp.losheredados.ventas.model.Detalle;


/**
 *
 * @author PC
 */
public interface DetalleDAO {
    int insertar(Detalle detalle);
    int modificar(Detalle detalle);
    int eliminar(int idDetalle);
    ArrayList<Detalle> listarTodos();
}

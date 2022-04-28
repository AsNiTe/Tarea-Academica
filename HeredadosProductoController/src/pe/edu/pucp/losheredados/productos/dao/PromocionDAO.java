/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.losheredados.productos.dao;

import java.util.ArrayList;
import pe.edu.pucp.losheredados.productos.model.Promocion;

/**
 *
 * @author Roberto Carlos
 */
public interface PromocionDAO {
    int insertar(Promocion promocion);
    int modificar(Promocion promocion);
    int eliminar(int id_promocion);
    ArrayList<Promocion> listarTodos();
}

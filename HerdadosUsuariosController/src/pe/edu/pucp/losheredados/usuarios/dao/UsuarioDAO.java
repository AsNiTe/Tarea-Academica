/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.losheredados.usuarios.dao;

import java.util.ArrayList;
import pe.edu.pucp.losheredados.usuarios.model.Usuario;
public interface UsuarioDAO {
     int insertar(Usuario usuario);
    int modificar(Usuario usuario);
    int eliminar(int idUsuario);
    ArrayList<Usuario> listarTodas();
    Usuario buscarPorId(int idUsuario);
}

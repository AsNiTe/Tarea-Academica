/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.losheredados.usuarios.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.heredadossoft.config.DBManager;
import pe.edu.pucp.losheredados.usuarios.dao.UsuarioDAO;
import pe.edu.pucp.losheredados.usuarios.model.Usuario;

/**
 *
 * @author JOSE
 */
public class UsuarioMySQL implements UsuarioDAO{
    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;

    @Override
    public int insertar(Usuario usuario) {
        int resultado = 0;
    try{
        con = DBManager.getInstance().getConnection();
        
        
        
        
       
        
        
    } catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
        
        
        
     
    }

    @Override
    public int modificar(Usuario usuario) {
            int resultado = 0;
    try{
        
        
        
       
        
        
    } catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
        
        
    }

    @Override
    public int eliminar(int idUsuario) {
           int resultado = 0;
    try{
        
        
        
       
        
        
    } catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
        
        
    }

    @Override
    public ArrayList<Usuario> listarTodas() {
      
    try{
        
        
        
       
        
        
    } catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }  
        return null;
    }

    @Override
    public Usuario buscarPorId(int idUsuario) {
      return null;
    }
    
}

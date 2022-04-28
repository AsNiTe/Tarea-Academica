/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.losheredados.productos.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.heredadossoft.config.DBManager;
import pe.edu.pucp.losheredados.productos.dao.ServicioDAO;
import pe.edu.pucp.losheredados.productos.model.Servicio;

/**
 *
 * @author Roberto Carlos
 */
public class ServicioMySQL implements ServicioDAO{

    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;
    @Override
    public int insertar(Servicio servicio) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_SERVICIO(?,?,?)}");
            cs.registerOutParameter("_id_servicio", java.sql.Types.INTEGER);
            cs.setString("_nombre",servicio.getNombre());
            cs.setDouble("_costo",servicio.getCosto());
           
            cs.executeUpdate();
            servicio.setIdServicio(cs.getInt("_id_servicio"));
            
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int modificar(Servicio servicio) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call MODIFICAR_SERVICIO(?,?,?)}");
            cs.setInt("_id_servicio", servicio.getIdServicio());
            cs.setString("_nombre",servicio.getNombre());
            cs.setDouble("_costo",servicio.getCosto());
           
            cs.executeUpdate();
            
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int eliminar(int id_servicio) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_SERVICIO(?)}");
            cs.setInt("_id_servicio", id_servicio);
           
            cs.executeUpdate();
            
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public ArrayList<Servicio> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

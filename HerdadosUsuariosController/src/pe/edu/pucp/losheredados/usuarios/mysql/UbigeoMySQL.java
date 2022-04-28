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
import pe.edu.pucp.losheredados.usuarios.dao.UbigeoDAO;
import pe.edu.pucp.losheredados.usuarios.model.Ubigeo;

/**
 *
 * @author JOSE
 */
public class UbigeoMySQL implements UbigeoDAO{
    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;

    @Override
    public int insertar(Ubigeo ubigeo) {
    int resultado = 0;
    try{
        con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call INSERTAR_UBIGEO(?,?,?,?,?)}");
        cs.setInt("_id_ubigeo", ubigeo.getIdUbigeo());
        cs.setString("_distrito",ubigeo.getDistrito());
        cs.setString("_provincia",ubigeo.getProvincia());
        cs.setString("_departamento", ubigeo.getDepartamento());
        cs.setDouble("_costo_de_envio",ubigeo.getCostoDeEnvio());
        cs.executeUpdate();
        resultado = 1;
        
    } catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;    
    }

    @Override
    public int modificar(Ubigeo ubigeo) {
        int resultado = 0;
    try{
        con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call MODIFICAR_UBIGEO(?,?,?,?,?)}");
        cs.setInt("_id_ubigeo", ubigeo.getIdUbigeo());
        cs.setString("_distrito",ubigeo.getDistrito());
        cs.setString("_provincia",ubigeo.getProvincia());
        cs.setString("_departamento", ubigeo.getDepartamento());
        cs.setDouble("_costo_de_envio",ubigeo.getCostoDeEnvio());
        cs.executeUpdate();
        resultado = 1;
        
    } catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;  
    }

    @Override
    public int eliminar(int idUbigeo) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_UBIGEO(?)}");
            cs.setInt("_id_ubigeo", idUbigeo);
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
    public ArrayList<Ubigeo> listarTodas() {
         ArrayList<Ubigeo> ubigeos = new ArrayList<>();
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call LISTAR_UBIGEO_TODAS()}");
            rs = cs.executeQuery();
            while(rs.next()){
               Ubigeo ubigeo = new Ubigeo();
               ubigeo.setIdUbigeo(rs.getInt("id_ubigeo"));
               ubigeo.setDepartamento(rs.getString("departamento"));
               ubigeo.setProvincia(rs.getString("provincia"));
               ubigeo.setDistrito(rs.getString("distrito"));
               ubigeo.setCostoDeEnvio(rs.getDouble("costo_de_envio"));  
               ubigeos.add(ubigeo);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return ubigeos;
    }

    @Override
    public Ubigeo buscarPorId(int idUbigeo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

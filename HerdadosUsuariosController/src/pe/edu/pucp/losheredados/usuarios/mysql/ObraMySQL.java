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
import pe.edu.pucp.losheredados.usuarios.dao.ObraDAO;
import pe.edu.pucp.losheredados.usuarios.model.Obra;

/**
 *
 * @author JOSE
 */
public class ObraMySQL implements ObraDAO{
    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;
    
    
    @Override
    public int insertar(Obra obra) {
        int resultado = 0;
    try{
        con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call INSERTAR_OBRA(?,?,?,?,?)}");
        cs.registerOutParameter("_id_obra", java.sql.Types.INTEGER);
        cs.setInt("_fid_encargado",obra.getEncargado().getIdUsuario());
        cs.setInt("_fid_ubigeo",obra.getZona().getIdUbigeo());
        cs.setString("_estado", obra.getEstado());
        cs.setString("_direccion",obra.getDireccion());
        cs.executeUpdate();
        obra.setIdObra(cs.getInt("_id_obra"));
        resultado = 1;
        
    } catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int modificar(Obra obra) {
         int resultado = 0;
    try{
        con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call MODIFICAR_OBRA(?,?,?,?,?)}");
        cs.setInt("_id_obra", obra.getIdObra());
        cs.setInt("_fid_encargado",obra.getEncargado().getIdUsuario());
        cs.setInt("_fid_ubigeo",obra.getZona().getIdUbigeo());
        cs.setString("_estado", obra.getEstado());
        cs.setString("_direccion",obra.getDireccion());
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
    public int eliminar(int idObra) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_OBRA(?)}");
            cs.setInt("_id_obra", idObra);
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
    public ArrayList<Obra> listarTodas() {
        ArrayList<Obra> obras = new ArrayList<>();
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call LISTAR_OBRA_TODAS()}");
            rs = cs.executeQuery();
            while(rs.next()){
               Obra obra = new Obra();
               obra.setIdObra(rs.getInt("id_obra"));
               obra.setEstado(rs.getString("estado"));
               //obra.getEncargado().setIdUsuario(rs.getInt("id_obra"));
               //obra.getZona().setIdUbigeo(rs.getInt("id_obra"));
               obra.setDireccion(rs.getString("direccion"));  
               obras.add(obra);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return obras;
    }

    @Override
    public Obra buscarPorId(int idObra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


package pe.edu.pucp.losheredados.usuarios.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.heredadossoft.config.DBManager;
import pe.edu.pucp.losheredados.usuarios.dao.TrabajadorDAO;
import pe.edu.pucp.losheredados.usuarios.model.Trabajador;


public class TrabajadorMySQL implements TrabajadorDAO {
    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;
    
    @Override
    public int insertar(Trabajador trabajador) {
        int resultado = 0;
    try{
        con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call INSERTAR_TRABAJADOR(?,?,?,?,?,?)}");
        cs.registerOutParameter("_id_trabajador", java.sql.Types.INTEGER);
        cs.setString("_area",trabajador.getArea());
        cs.setString("_cargo",trabajador.getCargo());
        cs.setString("_correo", trabajador.getCorreo());
        cs.setString("_nombre",trabajador.getNombre());
        cs.setInt("_telefono",trabajador.getTelefono());
        cs.executeUpdate();
        trabajador.setIdUsuario(cs.getInt("_id_trabajador"));
        resultado = 1;
        
    } catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int modificar(Trabajador trabajador) {
        int resultado = 0;
    try{
        con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call MODIFICAR_TRABAJADOR(?,?,?,?,?,?)}");
        cs.setInt("_id_usuario", trabajador.getIdUsuario());
        cs.setString("_area",trabajador.getArea());
        cs.setString("_cargo",trabajador.getCargo());
        cs.setString("_correo", trabajador.getCorreo());
        cs.setString("_nombre",trabajador.getNombre());
        cs.setInt("_telefono",trabajador.getTelefono());
        cs.executeUpdate();
        resultado = 1;
        
    } catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;    }

    @Override
    public int eliminar(int idTrabajador) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_TRABAJADOR(?)}");
            cs.setInt("_id_usuario", idTrabajador);
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
    public ArrayList<Trabajador> listarTodas() {
          ArrayList<Trabajador> trabajadores = new ArrayList<>();
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call LISTAR_TRABAJADOR_TODOS()}");
            rs = cs.executeQuery();
            while(rs.next()){
               Trabajador tra = new Trabajador();
               tra.setIdUsuario(rs.getInt("id_trabajador"));
               tra.setArea(rs.getString("area"));
               tra.setCargo(rs.getString("cargo"));
               tra.setTelefono(rs.getInt("telefono"));
               tra.setNombre(rs.getString("nombre"));
               tra.setCorreo(rs.getString("correo"));  
               trabajadores.add(tra);
            }
        }catch(Exception ex){ 
            //SELECT t.id_trabajador, t.area, t.cargo, u.nombre, u.telefono, u.correo, u.fecharegistro
            //, u.fechamodificacion FROM usuario u INNER JOIN trabajador t ON u.id_usuario = t.id_trabajador WHERE u.activa = 1;
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return trabajadores;
    }

    @Override
    public Trabajador buscarPorId(int idTrabajador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

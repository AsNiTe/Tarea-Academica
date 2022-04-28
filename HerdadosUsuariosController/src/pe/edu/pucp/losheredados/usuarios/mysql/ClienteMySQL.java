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
import pe.edu.pucp.losheredados.usuarios.dao.ClienteDAO;
import pe.edu.pucp.losheredados.usuarios.model.Cliente;
import pe.edu.pucp.losheredados.usuarios.model.Cliente_Categoria;

/**
 *
 * @author JOSE
 */
public class ClienteMySQL implements ClienteDAO {
    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;

    @Override
    public int insertar(Cliente cliente) {
          int resultado = 0;
    try{
        con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call INSERTAR_CLIENTE(?,?,?,?,?,?,?,?)}");
        cs.registerOutParameter("_id_cliente", java.sql.Types.INTEGER);
        cs.setInt("_fid_cliente_categoria", cliente.getCategoria().getIdCliente_Categoria());
        cs.setString("_RUC",cliente.getRUC());
        cs.setString("_razon_social",cliente.getRazonSocial());
        cs.setString("_personaContacto",cliente.getPersonaContacto());
        cs.setString("_correo", cliente.getCorreo());
        //cs.setDate("_fecha_nacimiento",new java.sql.Date(empleado.getFechaNacimiento().getTime()));
        cs.setString("_nombre",cliente.getNombre());
        cs.setInt("_telefono",cliente.getTelefono());
        cs.executeUpdate();
        cliente.setIdUsuario(cs.getInt("_id_cliente"));
        resultado = 1;
        
    } catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;   
    }

    @Override
    public int modificar(Cliente cliente) {
        int resultado = 0;
    try{
        con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call MODIFICAR_CLIENTE(?,?,?,?,?,?,?,?,?,?)}");
        cs.setInt("_id_usuario",cliente.getIdUsuario());
        cs.setInt("_fid_cliente_categoria", cliente.getCategoria().getIdCliente_Categoria());
        cs.setString("_RUC",cliente.getRUC());
        cs.setString("_razon_social",cliente.getRazonSocial());
        cs.setString("_personaContacto",cliente.getPersonaContacto());
        cs.setString("_correo", cliente.getCorreo());
        //cs.setDate("_fecha_nacimiento",new java.sql.Date(empleado.getFechaNacimiento().getTime()));
        cs.setString("_nombre",cliente.getNombre());
        cs.setInt("_telefono",cliente.getTelefono());
        cs.setDouble("_deuda_pendiente_total",cliente.getDeudaPendienteTotal());
        cs.setDouble("_deuda_vencida",cliente.getDeudaVencidas());
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
    public int eliminar(int idCliente) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_CLIENTE(?)}");
            cs.setInt("_id_usuario", idCliente);
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
    public ArrayList<Cliente> listarTodas() {
          ArrayList<Cliente> clientes = new ArrayList<>();
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call LISTAR_CLIENTE_TODAS()}");
            rs = cs.executeQuery();
            while(rs.next()){
               Cliente cli = new Cliente();
               cli.setIdUsuario(rs.getInt("id_usuario"));
               cli.setTelefono(rs.getInt("telefono"));
               cli.setNombre(rs.getString("nombre"));
               cli.setCorreo(rs.getString("correo"));  
               cli.setRUC(rs.getString("RUC"));
               cli.setRazonSocial(rs.getString("razon_social"));
               cli.setPersonaContacto(rs.getString("personaContacto"));
               cli.setCategoria(new Cliente_Categoria());
               cli.getCategoria().setIdCliente_Categoria(rs.getInt("id_cliente_categoria"));
               cli.getCategoria().setNombre(rs.getString("nombre_categoria"));
               cli.getCategoria().setLineaCredito(rs.getDouble("linea_credito"));
               clientes.add(cli);
            }
        }catch(Exception ex){ 
            //SELECT us.id_usuario,us.nombre,us.telefono,us.correo,cl.RUC,cl.razon_social,cl.personaContacto, clc.id_cliente_categoria, clc.nombre,clc.linea_credito 
    //FROM cliente cl, usuario us,cliente_categoria clc 
    //WHERE us.id_usuario=cl.id_cliente AND cl.fid_cliente_categoria = clc.id_cliente_categoria AND clc.activa=1 AND us.activa=1;
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return clientes;
    }

    @Override
    public Cliente buscarPorId(int idCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

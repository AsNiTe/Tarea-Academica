/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pe.pucp.losheredados.ventas.mysql;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.heredadossoft.config.DBManager;
import pe.edu.pe.pucp.losheredados.ventas.dao.VentaDAO;
import pe.edu.pe.pucp.losheredados.ventas.model.Cotizacion;
import pe.edu.pe.pucp.losheredados.ventas.model.Pago;
import pe.edu.pe.pucp.losheredados.ventas.model.TiposdePago;
import pe.edu.pe.pucp.losheredados.ventas.model.Venta;


/**
 *
 * @author PC
 */
public class VentaMySQL  implements VentaDAO{
    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;
    
    @Override
    public int insertar(Venta venta){
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_VENTA(?,?,?,?,?,?,?,?)}");
            cs.registerOutParameter("_id_venta", java.sql.Types.INTEGER);
            cs.setInt("_fid_cotizacion", venta.getCotizacion().getIdCotizacion());
            cs.setInt("_fid_pago", venta.getPago().getIdPago());
            cs.setString("_estado",venta.getEstado());
            cs.setDate("_fecha_entrega",new java.sql.Date(venta.getFechaEntrega().getTime()));
            cs.setDate("_fecha_emision_pago",new java.sql.Date(venta.getFechaEmisionPago().getTime()));
            cs.setDate("_fecha_pago",new java.sql.Date(venta.getFechaPago().getTime()));
            cs.setInt("_plazoPagoDias",venta.getPlazoPagoDias());
            cs.executeUpdate();
            venta.setIdVenta(cs.getInt("_id_venta"));
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }
    
    @Override
    public int modificar(Venta venta){
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call MODIFICAR_VENTA(?,?,?,?,?,?,?,?)}");
            cs.setInt("_id_venta", venta.getIdVenta());
            cs.setInt("_fid_cotizacion", venta.getCotizacion().getIdCotizacion());
            cs.setInt("_fid_pago", venta.getPago().getIdPago());
            cs.setString("_estado",venta.getEstado());
            cs.setDate("_fecha_entrega",new java.sql.Date(venta.getFechaEntrega().getTime()));
            cs.setDate("_fecha_emision_pago",new java.sql.Date(venta.getFechaEmisionPago().getTime()));
            cs.setDate("_fecha_pago",new java.sql.Date(venta.getFechaPago().getTime()));
            cs.setInt("_plazoPagoDias",venta.getPlazoPagoDias());
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
    public int eliminar(int idVenta){
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_VENTA(?)}");
            cs.setInt("_id_venta", idVenta);
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
    public ArrayList<Venta> listarTodas(){
        ArrayList<Venta> ventas = new ArrayList<>();
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call LISTAR_VENTAS_TODOS()}");
            rs = cs.executeQuery();
            while(rs.next()){
               Venta venta = new Venta();
               venta.setIdVenta(rs.getInt("_id_venta"));
               venta.setEstado(rs.getString("estado"));
               venta.setFechaEntrega(rs.getDate("fecha_entrega"));
               venta.setFechaEmisionPago(rs.getDate("fecha_emision_pago"));
               venta.setFechaPago(rs.getDate("fecha_pago"));
               venta.setPlazoPagoDias(rs.getInt("plazoPagoDias"));
               venta.setCotizacion(new Cotizacion());

               venta.getCotizacion().setEstado(rs.getString("estado"));
               venta.getCotizacion().setFecha(rs.getDate("fecha"));
               venta.getCotizacion().setIGV(rs.getFloat("IGV"));
               venta.getCotizacion().setSubTotal(rs.getFloat("sub_total"));
               venta.getCotizacion().setTotal(rs.getFloat("total"));

               venta.setPago(new Pago());
               venta.getPago().setParteContado(rs.getDouble("parte_Contado"));
               venta.getPago().setParteCredito(rs.getDouble("parte_Credito"));
               venta.getPago().setTipoPago(TiposdePago.valueOf("tipo_pago"));
               ventas.add(venta);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return ventas;
    }
}

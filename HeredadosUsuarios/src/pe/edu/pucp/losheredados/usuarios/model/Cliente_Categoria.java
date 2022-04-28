/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.losheredados.usuarios.model;

/**
 *
 * @author PC
 */
public class Cliente_Categoria {
        private int idCliente_Categoria;
	private String nombre;
	private double lineaCredito; 

        public int getIdCliente_Categoria() {
            return idCliente_Categoria;
        }

        public void setIdCliente_Categoria(int idCliente_Categoria) {
            this.idCliente_Categoria = idCliente_Categoria;
        }
        
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLineaCredito() {
		return lineaCredito;
	}
	public void setLineaCredito(double lineaCredito) {
		this.lineaCredito = lineaCredito;
	}
        
        public Cliente_Categoria(){}
	
	public Cliente_Categoria(String nombre,double lineaCredito){
		this.nombre=nombre;
		this.lineaCredito=lineaCredito;
	}    
}

package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal = 1, volumen = 1, precio = 500;
    boolean estado; // encendido true, apagado false.
	private Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		++numTV;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public Control getControl() {
		return control;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public int getNumTV() {
		return numTV;
	}
	 	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
}

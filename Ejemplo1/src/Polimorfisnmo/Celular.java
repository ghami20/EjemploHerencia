package Polimorfisnmo;

public class Celular {
	protected String marca;
	protected double bateria;
	protected boolean estado;
	public Celular(String marca, int bateria, boolean estado) {
		super();
		this.marca = marca;
		this.bateria = bateria;
		this.estado = estado;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getBateria() {
		return bateria;
	}
	public void setBateria(double bateria) {
		this.bateria = bateria;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", bateria=" + bateria + ", estado=" + estado + "]";
	}
	
	public boolean RealizarLlamada(Celular receptor,int duracion) {
			
		if(this.estado==true && receptor.estado==true) {
			
			
			
		}
		
		return true;
	}
}

package Polimorfisnmo;

import javax.swing.JOptionPane;

public class Iphone extends Celular{
	private String VersIos;

	public Iphone(String marca,  boolean estado, String versIos) {
		super(marca, 5, estado);
		VersIos = versIos;
	}
	public Iphone(String marca, int bateria, boolean estado, String versIos) {
		super(marca, bateria, estado);
		VersIos = versIos;
	}
	public String getVersIos() {
		return VersIos;
	}

	public void setVersIos(String versIos) {
		VersIos = versIos;
	}

	@Override
	public String toString() {
		return "Iphone [VersIos=" + VersIos + "]";
	}

	@Override
	public boolean RealizarLlamada(Celular receptor, int duracion) {
		if(this.estado==true && receptor.estado==true) {
			if ( this.bateria>=duracion*0.1) {
				JOptionPane.showMessageDialog(null,
						"Se pudo realizar la llamada desde" + this.marca + " hacia el celular " + receptor.marca 
						);
				bateria = bateria - duracion*0.1;
				return true;
			}else {
				// determinar cuantos minutos se puede llamar,
				// o directamente no hacer la llamada
			}
		}else {
			return false;
		}
		return true;
	}
	
	
	
}

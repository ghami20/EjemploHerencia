package Ejercicio1;

import javax.swing.JOptionPane;

public class Empleado {

	private String nombre;
	private int sueldoBase;
	private int diasFalto;
	private String desempeño;

	public Empleado(String nombre, int sueldoBase, int diasFalto, String desempeño) {
		super();
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.diasFalto = diasFalto;
		this.desempeño = desempeño;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getDiasFalto() {
		return diasFalto;
	}

	public void setDiasFalto(int diasFalto) {
		this.diasFalto = diasFalto;
	}

	public String getDesempeño() {
		return desempeño;
	}

	public void setDesempeño(String desempeño) {
		this.desempeño = desempeño;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldoBase=" + sueldoBase + ", diasFalto=" + diasFalto + ", desempeño="
				+ desempeño + "]";
	}

	public double bonoXDesempenio() {
		double bonoD = 0;
		if (this.desempeño.equals("Bueno")) {
			bonoD = this.sueldoBase * 0.10;
			JOptionPane.showMessageDialog(null, "Su desempeño fué bueno, tiene un 10% de bono sobre el etotal");
		} else if (this.desempeño.equals("Regular")) {
			JOptionPane.showMessageDialog(null, "Su desempeño fué regular, tiene $80 de bono");
			bonoD = 80;
		} else {
			JOptionPane.showMessageDialog(null, "Su desempeño fué malo, no corresponde bono");
		}

		return bonoD;

	}

	public double bonoXPresentismo() {
		double bonoP = 0;

		if (this.diasFalto == 0) {
			JOptionPane.showMessageDialog(null, "No faltó ningún día");
			bonoP = 100;
		}
		if (this.diasFalto == 1) {
			JOptionPane.showMessageDialog(null, " faltó 1 día");
			bonoP = 50;
		} else {
			JOptionPane.showMessageDialog(null, " No corresponde");

		}
		return bonoP;

	}
	public void CalcularBonos() {
		double bonos = this.bonoXDesempenio() + this.bonoXPresentismo();
		JOptionPane.showMessageDialog(null, "El empleado " + this.nombre + " tiene un saldo base " + this.sueldoBase + " y tuvo bonos de " + bonos + " y su sueldo total es : " + (this.sueldoBase+bonos));
	
	}

}

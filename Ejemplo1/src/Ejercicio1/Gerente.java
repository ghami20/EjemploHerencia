package Ejercicio1;
public class Gerente extends Empleado{
	
	private String puesto;

	public Gerente(String nombre, int diasFalto, String desempeño, String puesto) {
		super(nombre, 1000, diasFalto, desempeño);
		this.puesto = puesto;
	}

	

}

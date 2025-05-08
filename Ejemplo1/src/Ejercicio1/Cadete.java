package Ejercicio1;

public class Cadete extends Empleado{

	private String sector;

	public Cadete(String nombre, int diasFalto, String desempeño, String sector) {
		super(nombre, 1500, diasFalto, desempeño);
		this.sector = sector;
	}
}

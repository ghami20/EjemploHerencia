package Ejercicio1;

import javax.swing.JOptionPane;

public class Main2 {

	
	public static void main(String[] args) {
		
		
		
		String []rendimiento ={
				"Bueno","Regular","Malo"
				};
		
		
		String nombre = JOptionPane.showInputDialog("Ingrese nombre");
		String desempenio = (String)JOptionPane.showInputDialog(null, "Seleccione su rendimiento", null, 0, null, rendimiento, rendimiento[0]);
		int diasfalto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dias qeu falto"));
		String sector = JOptionPane.showInputDialog("Ingrese sector");
		Cadete yo = new Cadete(nombre,diasfalto,desempenio,sector);
		
		yo.CalcularBonos();
		
		
		
		
		
	}
}

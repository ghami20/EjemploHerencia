//alumno es un usuario

import javax.swing.JOptionPane;

public class Alumno extends Usuario{
	//Atributos
	private String matricula;
	//Constructor
	public Alumno(String nombre, String mail, String contrasenia, String matricula) {
		super(nombre, mail, contrasenia);
		this.matricula = matricula;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", toString()=" + super.toString() + "]";
	}
	
	//
	public void rendirExamen() {
		
		int nota = (int)(Math.random()*10+1);
		if (nota>=4) {
			JOptionPane.showMessageDialog(null, "Aprobé "+ this.getNombre() );
		}else {
			JOptionPane.showMessageDialog(null, "Desaprobé" + this.getNombre() );

		}
		
	}
	
}

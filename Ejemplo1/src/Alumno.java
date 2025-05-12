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
	/**
	 * LOGIN DE LA CLASE ALUMNO*/
	@Override
	public boolean Login(String mail, String contrasenia) {

		if (this.contrasenia.equals(contrasenia) && this.getMail().equals(mail)) {
			JOptionPane.showMessageDialog(null, "Ingreso exitoso");
			JOptionPane.showMessageDialog(null, "Ingresò como alumno, puede ver estas opciones...");
			String[] opciones = {
					"Rendir examen","Ver información","Salir"
			};
			int opcion;
			do {
				
				opcion=JOptionPane.showOptionDialog(null, "Bienvenido alumno " + this.nombre, "", 0, 0, null, opciones, opciones[0]);
				switch (opcion) {
				case 0:
					this.rendirExamen();
					break;
				case 1:
					JOptionPane.showMessageDialog(null, this);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Nos vemos!");
					break;

				default:
					break;
				}
				
			} while (opcion!=2);
			
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Usuario invlido");
			return false;

		}

	}

	
	
	
}

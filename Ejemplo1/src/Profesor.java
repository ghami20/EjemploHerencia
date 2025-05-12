import javax.swing.JOptionPane;

public class Profesor extends Usuario{

	private String titulo;

	public Profesor(String nombre, String mail, String contrasenia, String titulo) {
		super(nombre, mail, contrasenia);
		this.titulo = titulo;
	}
	/**
	 * LOGIN DE LA CLASE PROFESOR*/
	@Override
	public boolean Login(String mail, String contrasenia) {

		if (this.contrasenia.equals(contrasenia) && this.getMail().equals(mail)) {
			JOptionPane.showMessageDialog(null, "Ingreso exitoso");
			JOptionPane.showMessageDialog(null, "Ingresò como profesor, puede ver estas opciones...");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Usuario invlido");
			return false;

		}

	}
	
}

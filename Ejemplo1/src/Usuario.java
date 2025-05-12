import javax.swing.JOptionPane;

public class Usuario {

	protected String nombre;
	protected String mail;
	protected String contrasenia;

	public Usuario(String nombre, String mail, String contrasenia) {
		this.nombre = nombre;
		this.mail = mail;
		this.contrasenia = contrasenia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", mail=" + mail + ", contrasenia=" + contrasenia + "]";
	}
	/**
	 * LOGIN DE LA CLASE USUARIO*/
	public boolean Login(String mail, String contrasenia) {

		if (this.contrasenia.equals(contrasenia) && this.getMail().equals(mail)) {
			JOptionPane.showMessageDialog(null, "Ingreso exitoso");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Usuario invlido");
			return false;

		}

	}

}

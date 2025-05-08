
public class Profesor extends Usuario{

	private String titulo;

	public Profesor(String nombre, String mail, String contrasenia, String titulo) {
		super(nombre, mail, contrasenia);
		this.titulo = titulo;
	}
	
	
}

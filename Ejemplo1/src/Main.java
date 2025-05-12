import javax.swing.JOptionPane;

public class Main {

	
	public static void main(String[] args) {

		Usuario nuevo = new Usuario("gamaliel","ghami@gmail.com","1234");
		nuevo.Login("","");
		
		Profesor yo = new Profesor("gamaliel","ghami@gmail.com","1234","Desarrollador de software");
		
		yo.Login("ghami@gmail.com","1234");

		
		Alumno Mateo = new Alumno("Mateo","Mateo@gmail.com","4321","pagò");

		Mateo.Login("Mateo@gmail.com", "4321");
	}
	
}

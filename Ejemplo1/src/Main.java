import javax.swing.JOptionPane;

public class Main {

	
	public static void main(String[] args) {
		
		Profesor yo = new Profesor("gamaliel","ghami@gmail.com","1234","Desarrollador de software");
		
		yo.Login("mail", "");
	
		JOptionPane.showMessageDialog(null, yo);
		
		Alumno Mateo = new Alumno("Mateo","Mateo@gmail.com","4321","pagò");
		
		JOptionPane.showMessageDialog(null, Mateo);
		Mateo.rendirExamen();
	}
	
}

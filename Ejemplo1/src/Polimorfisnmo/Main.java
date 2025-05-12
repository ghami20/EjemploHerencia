package Polimorfisnmo;

public class Main {

	public static void main(String[] args) {
		
		Celular motorola =new Celular("Motorola",5,true);
		
		Iphone iphone =new Iphone("15 pro max ",true,"18.0");
		
		iphone.RealizarLlamada(motorola, 10);
	}

}

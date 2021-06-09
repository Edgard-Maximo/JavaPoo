package exerciciosPoo;

import java.util.Scanner;

public class TestaAviao {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		Aviao av= new Aviao();	
		
		av.marca = "AZUL";
		av.setGasolina(sc.nextInt());
		av.Combustivel(av.getGasolina());
	}

}

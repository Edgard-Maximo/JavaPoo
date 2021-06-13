package Collections;

import java.util.ArrayList;
import java.util.Collections;


public class TestaCollections {

public static void main(String[] args) {
	
		String aula1 = "Bloco 1 - Java";
		String aula2 = "Bloco 2 - BackEnd";
		String aula3 = "Bloco 3 - FrontEnd";
		String aula4 = "Bloco de Carnaval";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		
		//System.out.println(aulas);
		//aulas.remove(3);
		//System.out.println("aulas");
		
		//for each ---> um for mais elaborado, utilizado vetores e matrizes (Arrays) Muito utilizado para percorrer 
		
		//for(String al : aulas){//declaro em qual variavel ele vai percorrer(String) declarar qualquer nome de variavel e dizer onde ele vai correr
		//System.out.println("AUla: " + al);
	
		//}
		
		//String primeiraAula = aulas.get(0);
		//System.out.println("A primeira Aula é: " + primeiraAula);
		//System.out.println("A segunda Aula é: " + aulas.get(1));
		
		//for(int i = 0; i < aulas.size(); i++) {
		//	System.out.println("AUla: " + (i+1) + " o : ' " + aulas.get(i) );
		//}
		
		//System.out.println(aulas.size());
		
		Collections.sort(aulas);
	//	System.out.println("Essa é a ordem" + aulas.set());
		
	}
}
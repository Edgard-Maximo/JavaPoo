package Collections;

import java.util.ArrayList;

public class TestaAulas {
	
	public static void main(String[] args) {
	
	Aula al1 = new Aula("Revisando ArrayList" , 50);
	Aula al2 = new Aula("Lista de objetos", 60);
	Aula al3 = new Aula("Relacionamento de Arrays" , 120);
	
	
	ArrayList<Aula> aulas = new ArrayList<>();
	
	aulas.add(al1);
	aulas.add(al2);
	aulas.add(al3);
	
	System.out.println( al1);
	
	}

}

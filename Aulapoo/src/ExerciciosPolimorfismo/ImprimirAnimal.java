package ExerciciosPolimorfismo;

import java.util.Scanner;

public class ImprimirAnimal {

		public static void main(String [] args) {
			
			
			Scanner scn = new Scanner(System.in);
			
			TestaAnimal cachorro = new TestaAnimal();
            TestaAnimal cavalo = new TestaAnimal();
            TestaAnimal preguica = new TestaAnimal();
			
		
			System.out.println("Digite o nome do seu cachorro");
			System.out.println();
			System.out.println("\nDigite a idade do seu cachororo: ");
            cachorro.setIdade(scn.nextInt());
		
			System.out.println("\nO som o que cachorro faz:"); cachorro.som(new Cachorro());
			System.out.println("\nO cachorro corre: "); cachorro.correr(new Cachorro());
			
			System.out.println();
			
			
			System.out.println("Digite o nome do seu cavalo");
			System.out.println();
			System.out.println("\nDigite a idade os Cavalo");
			cavalo.setIdade(scn.nextInt());
			
			System.out.println("\nO som o que Cavalo faz:"); cavalo.som(new Cavalo());
			System.out.println("\nO Cavalo corre: "); cavalo.correr(new Cavalo());
			
            System.out.println("Digite o nome da sua preguiça:");
            preguica.setNome(scn.nextLine());
            System.out.println("\nDigite a idade da sua preguiça:");
            preguica.setIdade(scn.nextInt());
			
            System.out.println("\nO som o que a Preguiça faz:"); preguica.som(new Cavalo());
			System.out.println("\nA Preguiça sobe em árvores: "); preguica.correr(new Cavalo());
            
		}
}

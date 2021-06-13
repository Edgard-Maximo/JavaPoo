package Collections;

import java.util.*;


public  class TestaAluno {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		ArrayList<Aluno> alunos = new ArrayList<>();

		
		System.out.println("Quantos Alunos você deseja add: ");
		int numeroAlunos = ent.nextInt();
		// ent.nextInt();

		for (int i = 0; i < numeroAlunos; i++) {

			System.out.println("Idade Aluno: ");
			int idade = ent.nextInt();
			 ent.nextLine();// feito só pra pular linhas

			System.out.println("Nome do Aluno");
			String nome = ent.nextLine();


			alunos.add(new Aluno(idade, nome));

		
		}
		for (Aluno ed : alunos) {
		System.out.println(ed);
		
		
	}
			//System.out.println(alunos.get(0));
		//ent.close();

	}
}

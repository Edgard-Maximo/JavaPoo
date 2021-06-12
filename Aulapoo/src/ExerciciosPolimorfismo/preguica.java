package ExerciciosPolimorfismo;

public class preguica extends  SuperClasseAnimal implements InterfaceAnimal {
	
			
	public void correr() {
		System.out.println("Minha preguiça corre uns 2 km por hora ");
	}

	@Override
	public void Som() {
		System.out.println("O barulho da minha preguica dormindo é: zzzzzzZZZZZZ");
		
	}

	@Override
	public void subir() {
		System.out.println("Minha preguiça sobre em 3 árvores");
		
	}

}

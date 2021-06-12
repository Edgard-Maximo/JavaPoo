package ExerciciosPolimorfismo;

public class Cachorro extends  SuperClasseAnimal implements InterfaceAnimal {

	
	public void correr() {
		System.out.println("Meu cachorro corre 10 km......");
	}

	@Override
	public void Som() {
		System.out.println("Ele late assim: AuauaUAu");
		
	}

	@Override
	public void subir() {
		System.out.println("Meu cachorro sempre sobe na minha cama, me deixa bravo-----> grrr");
		
	}
	
	
	}

package ExerciciosPolimorfismo;

public class Cavalo extends  SuperClasseAnimal implements InterfaceAnimal {

			
	public void correr() {
		System.out.println("Meu Cavalo Corre 20km");
	}

	@Override
	public void Som() {
		System.out.println("A risada do meu cavalo é assim: HiHi rem");
		
	}

	@Override
	public void subir() {
		System.out.println("Meu Cavalo já subiu 3x no pódio esse ano:");
		
	}

}

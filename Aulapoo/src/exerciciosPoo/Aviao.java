package exerciciosPoo;
//2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião, 

//defina as instancias deste objeto e apresente as informações deste objeto no console.

public class Aviao {

	String marca;
	private int gasolina;

	public int getGasolina() {

		return gasolina;

	}

	public void setGasolina(int gasolina) {

	}

	public boolean Combustivel(int gasolina) {
		if (gasolina < 100) {
			System.out.println("Abaixo do nível esperado!");

		} else {
			System.out.println("Permissão para seguir na viagem: " + gasolina);

		}

		return false;
	}
}

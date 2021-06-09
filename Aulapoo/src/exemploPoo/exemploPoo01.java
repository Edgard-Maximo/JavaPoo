package exemploPoo;

public class exemploPoo01 {

	static int numero1 = 100;
	static int numero2 = 200;
	static int soma;

	public static void main(String[] args) {//o main faz a chamada do metodos 

		metodo();
		metodo2();
		metodo3();
		metodo4(500, 259);
	}

	public static void metodo() {

		System.out.println("Eu sou um método:");
	}

	public static void metodo2() {
		soma = numero1 + numero2;
	}

	public static void metodo3() {
		System.out.println("A soma dos números é: " + soma);
	}

	public static void metodo4(int num1, int num2) {
		int subtracao = num1 - num2;
		System.out.println("Esse é o valor da subtração do metodo 4: " + subtracao);

	}

}

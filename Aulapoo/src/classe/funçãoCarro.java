package classe;

public class funçãoCarro {

	public static void main(String[] args) {

		Carro x = new Carro();
		Carro c2 = new Carro();

		x.nome = "vellar";
		x.marca = "vellar ford";
		x.ano = 2020;

		x.acelerar(200);
		System.out.println("Velocidade: " + x.velocidade);

		x.freiar(60);
		System.out.println("Velocidade Carro 1: " + x.velocidade);

		c2.acelerar(200);
		System.out.println("Velocidade: " + c2.velocidade);

		c2.freiar(40);
		System.out.println("Velocidade Carro 2: " + c2.velocidade);
	}
}

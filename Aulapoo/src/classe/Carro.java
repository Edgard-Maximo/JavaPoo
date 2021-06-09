package classe;

public class Carro {

	
	String nome;
	String marca;
	int ano;
	int velocidade;
	
	//métodos
	void acelerar(int aceleracao) {	
	velocidade += aceleracao;
	}
	
	void freiar(int reduzir) {
		velocidade -= reduzir;
		
	}
}

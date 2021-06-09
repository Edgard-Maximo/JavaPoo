package sobrecarga;

public class MinhaCalculadora {
	
	//Método do tipo inteiro =  recebe númros inteiros 
	public int soma(int num1, int num2) {
		
		return num1 + num2;
	}

	
	public double soma(double num1, double num2) {
		
		return num1 + num2;
	}
	
	
	public int soma(int num1, int num2, int num3) {//ele aceita ou tipo, desde que tenha algo diferente da primeira vez
		
		return num1 + num2 + num3;
		
	}
}

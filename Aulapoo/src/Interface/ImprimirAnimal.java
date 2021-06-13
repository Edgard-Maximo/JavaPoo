
package Interface;

public class ImprimirAnimal {
	
	public static void main(String[] args) {
		
		Cachorro meuCachorro = new Cachorro();
	
		Gato meuGato = new Gato();
		
		meuCachorro.somAnimal();
		meuCachorro.dormir();
		
		System.out.println();
		
		meuGato.somAnimal();
		meuGato.dormir();
		
	}
	
	

}

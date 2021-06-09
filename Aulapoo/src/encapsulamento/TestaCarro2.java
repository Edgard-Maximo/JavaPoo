package encapsulamento;

public class TestaCarro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro2 car = new Carro2();
		
		car.setMarca("fiat");
		car.setModelo("Palio");
		car.setCapacidadeCombustivel(45.45);
		car.setNumPassageiros(5);
		
		System.out.println("Marca: " + car.getMarca() );
		System.out.println("Modelo: " + car.getModelo() );
		System.out.println("Combustivel: " + car.getCapacidadeCombustivel() );
		System.out.println("Numero dePassageiros" + car.getNumPassageiros() );
	}

}

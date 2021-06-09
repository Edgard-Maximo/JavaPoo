package exerciciosPoo;

public class TestaCliente {

	public static void main(String[] args) {
		
	
	Cliente cl = new Cliente();
	
	cl.nome = "Edgard";
	cl.tipoDeCompra = "Roupas";
	cl.valor = 35;
	
	System.out.println("Nome do cliente: " + cl.nome);
	System.out.println("Tipo da compra: " + cl.tipoDeCompra);
	System.out.println("Valor da sua compra: " + cl.valor);
}
}


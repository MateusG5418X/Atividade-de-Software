

import PedidoBuilder;
import Pedido;

public class PrincipalBuilder {

	public static void main(String[] args) {
		
		Pedido pedido = new PedidoBuilder()
							.setPedido("9999")
							.setCliente(100, "Alef", "98149-3577")
							.setVendedor(1, "Alef")
							.setProduto("PC", 2, new BigDecimal(8.000))
							.setProduto("Monitor", 4, new BigDecimal(6.000))
							.setProduto("SSD", 3, new BigDecimal(750))
							.builder();
		
		pedido.informacoes();
		
	}
	
}
import java.math.BigDecimal;
import java.util.ArrayList;

import modelo.Produto;
import modelo.Cliente;
import modelo.Pedido;
import modelo.Vendedor;

public class Principal {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();

		cliente.setCodigo(100);
		cliente.setNome("Silva");
		cliente.setTelefone("98149-3577");

		Vendedor vendedor = new Vendedor();

		vendedor.setCodigo(1);
		vendedor.setNome("Alef");

		Produto produto1 = new Produto();

		produto1.setNome("Pc");
		produto1.setQuantidade(2);
		produto1.setValor(new BigDecimal(8.000));

		Produto produto2 = new Produto();

		produto2.setNome("Monitor");
		produto2.setQuantidade(4);
		produto2.setValor(new BigDecimal(4.500));

        Produto produto3 = new Produto();

		produto2.setNome("SSD");
		produto2.setQuantidade(2);
		produto2.setValor(new BigDecimal(750));

		Pedido pedido = new Pedido();

		pedido.setNumeroPedido("00001");
		pedido.setCliente(cliente);
		pedido.setVendedor(vendedor);
		pedido.setprodutos(new ArrayList<>());
		pedido.getprodutos().add(produto1);
		pedido.getprodutos().add(produto2);

		pedido.informacoes();

	}

}
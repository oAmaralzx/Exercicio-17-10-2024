//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criar alguns produtos
        Produto produto1 = new Produto("xaomi note 11", 1100.0);
        Produto produto2 = new Produto("iphone 11", 1600.0);
        Produto produto3 = new Produto("iphone 16", 11000.0);

        // Criar o carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        // Aplicar desconto para cliente novo
        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Desconto para Cliente Novo: R$ " + carrinho.calcularTotalComDesconto());

        // Aplicar desconto para cliente regular
        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Desconto para Cliente Regular: R$ " + carrinho.calcularTotalComDesconto());

        // Aplicar desconto para cliente VIP
        carrinho.setDescontoStrategy(new DescontoClienteVIP());
        System.out.println("Desconto para Cliente VIP: R$ " + carrinho.calcularTotalComDesconto());

    }
}

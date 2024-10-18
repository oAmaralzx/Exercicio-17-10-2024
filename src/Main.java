//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criar alguns produtos
        Produto produto1 = new Produto("Camiseta", 90.0);
        Produto produto2 = new Produto("Calça", 180.0);
        Produto produto3 = new Produto("Tênis", 450.0);

        // Criar o carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        // Aplicar desconto para cliente novo
        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Total para Cliente Novo: R$ " + carrinho.calcularTotalComDesconto());

        // Aplicar desconto para cliente regular
        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Total para Cliente Regular: R$ " + carrinho.calcularTotalComDesconto());

        // Aplicar desconto para cliente VIP
        carrinho.setDescontoStrategy(new DescontoClienteVIP());
        System.out.println("Total para Cliente VIP: R$ " + carrinho.calcularTotalComDesconto());

    }
}

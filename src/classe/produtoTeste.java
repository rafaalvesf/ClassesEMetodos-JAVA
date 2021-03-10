package classe;

public class produtoTeste {
    public static void main(String[] args) {

        produto novoProduto1 = new produto();
        novoProduto1.nomeProduto = "Notebook";
        novoProduto1.preco = 1999.99;
        novoProduto1.desconto = 0.20;

        produto novoProduto2 = new produto();
        novoProduto2.nomeProduto = "SSD 280GB";
        novoProduto2.preco = 199.99;
        novoProduto2.desconto = 0.10;

        System.out.println("Parabens pela aquisição!");
        System.out.println("Produtos Selecionados: ");
        System.out.println(novoProduto1.nomeProduto);
        System.out.println(novoProduto2.nomeProduto);
        System.out.println("Valor total: ");
        double precoFinal = (novoProduto1.preco * (1 - novoProduto1.desconto))
                + (novoProduto2.preco * (1 - novoProduto2.desconto));
        System.out.printf("R$ %.2f", precoFinal );

    }
}

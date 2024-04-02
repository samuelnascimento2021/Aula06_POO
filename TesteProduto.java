public class TesteProduto {
    public static void main(String[] args) {

        Produto p1 = new Produto("Celular", 5000.0, 8);
        Produto p2 = new Produto("Headset", 250.0, 35);

        imprimirDetalhes(p1);
        imprimirDetalhes(p2);

        p1.adicionarEstoque(22);
        p2.adicionarEstoque(15);

        imprimirDetalhes(p1);
        imprimirDetalhes(p2);

        p1.removerEstoque(5);
        p2.removerEstoque(10);

        imprimirDetalhes(p1);
        imprimirDetalhes(p2);
    }

    public static void imprimirDetalhes(Produto produto) {
        System.out.println("Detalhes do Produto:");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço unitário: " + produto.getPrecoUnitario());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());
        System.out.println("--------------------------");
    }
}
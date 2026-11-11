import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ex6Produto novoProdutoFisico = new ex6ProdutoFisico("Shampoo",20,5);
        novoProdutoFisico.calcularPrecoFinal();
        novoProdutoFisico.exibirDetalhes();
        System.out.println("=======================");
        ex6Produto novoProdutoDigital = new ex6ProdutoDigital("GTA VI", 499,19.99);
        novoProdutoDigital.calcularPrecoFinal();
        novoProdutoDigital.exibirDetalhes();
    }
}
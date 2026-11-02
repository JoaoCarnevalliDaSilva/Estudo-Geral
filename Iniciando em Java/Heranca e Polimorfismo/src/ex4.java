import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ex4Pagamento novoCartao = new ex4PagamentoCartao(200, 1234567890);
        novoCartao.processarPagamento();
        System.out.println("------------------------");
        ex4Pagamento novoBoleto = new ex4PagamentoBoleto(400, 987654321);
        novoBoleto.processarPagamento();
    }
}
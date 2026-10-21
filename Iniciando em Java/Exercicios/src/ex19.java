import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaCorrente2 novaConta = new ContaCorrente2();
        novaConta.setTitular("Joao");
        novaConta.setLimite(500.00);
        novaConta.depositar(200.00);
        novaConta.sacar(400.00);
        novaConta.exibirSaldo();

        scanner.close();
    }
}
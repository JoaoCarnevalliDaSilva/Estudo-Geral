import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaCorrente novaConta = new ContaCorrente();
        novaConta.definirLimites(500.00);
        novaConta.depositar(200.00);
        novaConta.sacar(800.00);



        scanner.close();
    }
}
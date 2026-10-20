import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContaBancaria c1 = new ContaBancaria();
        c1.titular = "Carlos";
        c1.depositar(100.0);
        c1.abrirConta();
        c1.depositar(150.0);
        c1.sacar(200.0);
        c1.sacar(50.0);
        c1.exibirExtrato();

        scanner.close();
    }
}
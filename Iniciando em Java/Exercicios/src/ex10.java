import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verificador de ano bissexto. Digite um ano:");
        int ano = scanner.nextInt();
        boolean anoBi = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        if (anoBi) {
            System.out.printf("O ano %d eh bissexto%n", ano);
        } else {
            System.out.printf("O ano %d nao eh bissexto%n", ano);
        }
        scanner.close();
    }
}
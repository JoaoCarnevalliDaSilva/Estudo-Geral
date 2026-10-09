import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Olá, informe seu nome: ");
        String name = scanner.next();
        System.out.printf("Informe sua idade: ");
        int age = scanner.nextInt();
        System.out.printf("O seu nome eh %s e sua idade eh de %d", name, age);


        scanner.close();
    }
}
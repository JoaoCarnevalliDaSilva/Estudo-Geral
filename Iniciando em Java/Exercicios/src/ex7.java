import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Informe o segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.printf("%d + %d = %d \n", numero1, numero2, numero1+numero2);

wssa

        scanner.close();
    }
}
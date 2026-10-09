import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite um valor inteiro: ");
        int n = scanner.nextInt();
        do {
            System.out.printf("Valor invalido. Deve ser de 1 a 10. Digite novamente: ");
            n = scanner.nextInt();
        } while (n < 1 || n > 10);

        for(int i=1; i<=10; i++){
            System.out.printf("%d x %d = %d %n", n,i, n*i);
        }

        scanner.close();
    }
}
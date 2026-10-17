import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor desejado:");
        int saque = scanner.nextInt();
        while (saque % 10 != 0 || saque < 0) {
            saque = scanner.nextInt();
        }
        int cedulas100 = 0;
        int cedulas50 = 0;
        int cedulas20 = 0;
        int cedulas10 = 0;
        int total =
                (saque/100)
                ;


        scanner.close();
    }
}
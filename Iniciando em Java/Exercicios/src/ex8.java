import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n < 1 || n > 100) {
            n = scanner.nextInt();
        }
        boolean temPar = false;
        boolean temImpar = false;
        boolean temNegativo = false;
        for (int i=0; i<n; i++) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                temNegativo = true;
            } else if (numero % 2 == 0) {
                temPar = true;
            } else {
                temImpar = true;
            }
        }
        if(temNegativo) {
            System.out.println("invalida");
        } else if (temPar && temImpar) {
            System.out.println("equilibrada");
        } else {
            System.out.println("incompleta");
        }
        scanner.close();
    }
}

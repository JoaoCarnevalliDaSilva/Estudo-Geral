import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalTentativas = scanner.nextInt();
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < totalTentativas; i++) {
            int numeroPortal = scanner.nextInt();

            if (numeroPortal <= 0) {
                resultado.append("INVALID");
            } else if(numeroPortal % 3 == 0) {
                resultado.append("OPEN");
            } else {
                resultado.append("CLOSED");
            }

            if (i < totalTentativas - 1) {
                resultado.append('\n');
            }
        }

        System.out.print(resultado);
        scanner.close();
    }
}
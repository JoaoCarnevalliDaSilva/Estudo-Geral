import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a medida do lado do quadrado:");
        float medidas = scanner.nextFloat();
        System.out.printf("Area: %.2f", medidas*medidas);

        scanner.close();
    }
}
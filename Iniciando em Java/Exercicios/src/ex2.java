import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        double imc = 0;
        imc = peso / (altura*altura);
        if (imc < 18.5) {
            System.out.printf("Abaixo do peso. IMC: %.2f", imc);
        } else if(imc >= 18.5 && imc < 25) {
            System.out.printf("Peso normal. IMC: %.2f", imc);
        } else if(imc >= 25 && imc < 30) {
            System.out.printf("Sobrepeso. IMC: %.2f", imc);
        } else {
            System.out.printf("Obesidade. IMC: %.2f", imc);
        }

        scanner.close();
    }
}
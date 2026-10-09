import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite um valor: ");
        int n = scanner.nextInt();
        while (n < 1 || n > 30) {
            System.out.printf("Valor invalido. Deve ser de 1 a 30. Digite novamente: ");
            n = scanner.nextInt();
        }

        double[] vetor = new double[n];
        double soma = 0, quant = 0;
        for(int i=0; i<n; i++) {
            System.out.printf("Digite um valor para a posicao %d: ", i+1);
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
            quant++;
        }
        double media = soma / quant;
        int quantidade = 0;
        for (int i = 0; i<n; i++) {
            if(vetor[i] > media) {
                quantidade++;
            }
        }

        System.out.printf("Media: %.2f%n", media);
        System.out.printf("Acima da media: %d", quantidade);

        scanner.close();
    }
}
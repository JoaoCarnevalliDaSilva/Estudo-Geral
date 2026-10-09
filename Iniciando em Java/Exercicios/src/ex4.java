import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite um valor: ");
        int n = scanner.nextInt();
        while (n < 1 || n > 50) {
            System.out.printf("Valor invalido. Deve ser de 1 a 50. Digite novamente: ");
            n = scanner.nextInt();
        }

        int[] vetor = new int[n];
        for(int i = 0; i<n; i++) {
            System.out.printf("Digite um valor para a posicao %d: ", i+1);
            vetor[i] = scanner.nextInt();
        }
        int maior = vetor[0], posicaoMaior = 0;
        int menor = vetor[0], posicaoMenor = 0;
        for (int i=0; i<n; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posicaoMenor = i;
            }
        }

        System.out.printf("Maior valor: %d (posicao %d)%n", maior, posicaoMaior);
        System.out.printf("Menor valor: %d (posicao %d)", menor, posicaoMenor);
        scanner.close();
    }
}
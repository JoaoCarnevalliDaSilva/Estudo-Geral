#include <stdio.h>

int soma_vetor(int n, int vetor[]);

int main(void) {

    int n;
    printf("Digite um valor para o tamanho do vetor: \n");
    scanf("%d", &n);
    if (n < 1 || n > 100) {
        printf("Valor invalido. Deve ser entre 1 e 100.");
        return 1;
    }
    int vetor[n];
    int resultado = soma_vetor(n, vetor);
    printf("A soma do vetor eh: %d", resultado);

    return 0;
}

int soma_vetor(int n, int vetor[]) {
    for (int i=0; i<n; i++) {
        printf("Digite um valor para a posicao %d: \n", i+1);
        scanf("%d", &vetor[i]);
    }
    int soma = 0;
    for (int i=0; i<n; i++) {
        soma += vetor[i];
    }
    return soma;
}
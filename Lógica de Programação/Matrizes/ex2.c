#include <stdio.h>

int maior_valor(int tamanho, int vetor[]);
int menor_valor(int tamanho, int vetor[]);

int main(void) {

    int n;
    printf("Digite um valor para o tamanho do vetor: \n");
    scanf("%d", &n);

    int vetor[n];
    for (int i=0; i<n;i++) {
        printf("Digite um valor para a posicao %d: \n", i+1);
        scanf("%d", &vetor[i]);
    }
    int resulMaior = maior_valor(n, vetor);
    int resulMenor = menor_valor(n, vetor);
    printf("Maior: %d\n", resulMaior);
    printf("Menor: %d", resulMenor);
    return 0;
}

int maior_valor(int tamanho, int vetor[]) {
    int maior = vetor[0];
    for (int i=0; i<tamanho; i++) {
        if (vetor[i]>maior) {
            maior = vetor[i];
        }
    }
    return maior;
}
int menor_valor(int tamanho, int vetor[]) {
    int menor = vetor[0];
    for (int i=0; i<tamanho; i++) {
        if (vetor[i]<menor) {
            menor = vetor[i];
        }
    }
    return menor;
}
#include <stdio.h>

int main(void) {

    int n;
    printf("Digite o tamanho do vetor: \n");
    scanf("%d", &n);
    int vetor[n];
    for (int i=0; i<n; i++) {
        printf("Digite um valor para a posicao: %d\n", i+1);
        scanf("%d", &vetor[i]);
    }
    int soma = 0;
    for (int i=0; i<n; i++) {
        soma += vetor[i];
    }

    printf("A soma dos elementos eh: %d", soma);

    return 0;
}

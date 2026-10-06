#include <stdio.h>

int inversor(int tamanho, int vetor[]);

int main(void) {

    int n;
    printf("Digite o tamanho do vetor: \n");
    scanf("%d", &n);

    int vetor[n];
    int resultado = inversor(n,vetor);
    printf("%d ", )
    return 0;
}

int inversor(int tamanho, int vetor[]) {
    for (int i=0; i<tamanho; i++) {
        printf("Digite um valor para a posicao: %d \n", i+1);
        scanf("%d", &vetor[i]);
    }
    int vetorInverso[tamanho];
    for (int i=tamanho; i<=0; i--) {
        vetorInverso = vetor[i];
    }
}

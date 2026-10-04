#include <stdio.h>

int main(void) {

    int n;
    printf("Digite quantos vetores deseja: \n");
    scanf("%d", &n);
    if (n <= 1 || n >= 100) {
        printf("Valor invalido.");
        return 1;
    }

    int x[n];
    for (int i=0; i<n; i++) {
        printf("Digite um valor para o elemento: %d \n", i+1);
        scanf("%d", &x[i]);
    }
    int posicao = 0, maior = x[0];
    for (int i=0; i<n; i++) {
        if (x[i] > maior) {
            maior = x[i];
            posicao = i;
        }
    }

    printf("Maior Valor: %d \n", maior);
    printf("Posicao: %d", posicao+1);

    return 0;
}
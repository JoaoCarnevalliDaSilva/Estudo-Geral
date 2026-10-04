#include <stdio.h>

int main(void) {

    int n;
    printf("Digite o tamanho do vetor: \n");
    scanf("%d", &n);
    if (n <= 0 || n > 100) {
        printf("Valor invalido");
        return 1;
    }
    int contPar = 0, contImpar = 0;
    int x[n];
    for (int i=0; i<n; i++) {
        printf("Digite um valor para a posicao: %d\n", i+1);
        scanf("%d", &x[i]);
    }

    for (int i=0; i<n; i++) {
        if (x[i] % 2 == 0) {
            contPar++;
        } else {
            contImpar++;
        }
    }

    printf("Pares: %d\n", contPar);
    printf("Impares: %d\n", contImpar);

    return 0;
}
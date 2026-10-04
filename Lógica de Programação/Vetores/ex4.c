#include <stdio.h>

int main(void) {

    int n;
    printf("Qual o tamanho do array: \n");
    scanf("%d", &n);
    if (n <= 0 || n > 100) {
        printf("Valor invalido.");
        return 1;
    }

    int x[n];
    for (int i = 0; i<n; i++) {
        printf("Digite o valor para a posicao: %d\n", i+1);
        scanf("%d", &x[i]);
    }

    for (int i=n-1; i>=0; i--) {
        printf("%d ", x[i]);
    }

    return 0;
}
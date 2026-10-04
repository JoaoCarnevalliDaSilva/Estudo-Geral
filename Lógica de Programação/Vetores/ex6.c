#include <stdio.h>

int main(void) {

    int n;
    printf("Digite quantos vetores deseja:\n");
    scanf("%d", &n);
    if (n<1 || n>100) {
        printf("Valor invalido");
        return 1;
    }
    int x[n];
    for (int i=0; i<n; i++) {
        printf("Digite um valor para a posicao: %d\n", i+1);
        scanf("%d", &x[i]);
    }

    for (int i=0; i<n; i++) {
        if (x[i] < 0) {
            x[i] = 0;
        }
        printf("%d ", x[i]);
    }

    return 0;
}
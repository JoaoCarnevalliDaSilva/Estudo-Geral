#include <stdio.h>

int main(void) {

    int n;
    printf("Quantos numeros serao digitados?\n");
    scanf("%d", &n);
    int soma = 0;
    for (int i=0; i<n; i++) {
        int x;
        printf("Digite um valor para a posicao: %d\n", i+1);
        scanf("%d", &x);
        if (x % 2 == 0) {
            soma += x;
        }
    }

    printf("A soma dos pares eh de: %d", soma);

    return 0;
}
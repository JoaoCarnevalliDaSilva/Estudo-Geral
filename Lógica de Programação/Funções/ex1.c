#include <stdio.h>

int eh_primo(int n);

int main(void) {

    int n;
    printf("Digite um valor: \n");
    scanf("%d", &n);

    if (n <= 1) {
        printf("Valor invalido. Numero deve ser positivo e maior do que 1");
        return 1;
    }

    int resultado = eh_primo(n);
    if (resultado == 1) {
        printf("Primo");
    } else {
        printf("Nao Primo");
    }

    return 0;
}

int eh_primo(int n) {
    for (int i=1; i<=n; i++) {
        
    }
}
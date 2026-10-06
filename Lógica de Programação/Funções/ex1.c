#include <stdio.h>

int eh_primo(int n);

int main(void) {

    int n;
    printf("Digite um valor: \n");
    scanf("%d", &n);

    int resultado = eh_primo(n);
    if (resultado == 1) {
        printf("Primo");
    } else {
        printf("Nao Primo");
    }

    return 0;
}

int eh_primo(int n) {
    if (n <=1) return 0;
    for (int i=2; i<n; i++) {
        if (n % i == 0) {
            return 0;
        }
    }
    return 1;
}
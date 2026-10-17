#include <stdio.h>

int fatorar(int n);

int main(void) {

    int n;
    printf("Digite um valor para a fatorial: \n");
    scanf("%d", &n);

    int resultado = fatorar(n);
    printf("Fatororial: %d", resultado);

    return 0;
}

int fatorar(int n) {
    int resultado = 1;
    for (int i = n; i > 1; i--) {
        resultado *= i;
    }
    return resultado;
}

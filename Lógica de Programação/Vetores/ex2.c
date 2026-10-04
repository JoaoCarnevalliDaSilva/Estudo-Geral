#include <stdio.h>

int main(void) {

    int a, b, c;
    printf("Digite 3 valores: \n");
    scanf("%d%d%d", &a,&b,&c);
    int maior = a, menor = a;
    if (b > maior) {
        maior = b;
    } if (c > maior) {
        maior = c;
    }

    if (b < menor) {
        menor = b;
    } if ( c < menor) {
        menor = c;
    }

    printf("MAIOR: %d \n", maior);
    printf("MENOR: %d", menor);
    return 0;
}
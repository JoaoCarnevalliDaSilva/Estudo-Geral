#include <stdio.h>

int main(void) {
    int n;
    printf("Digite um valor para as linhas e colunas: \n");
    scanf("%d", &n);

    if (n < 1 || n > 10) {
        printf("Valor invalido. Deve ser de 1 a 10.");
        return 1;
    }

    int matriz[n][n];
    for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++) {
            printf("Digite um valor para a linha %d e coluna %d: \n", i+1, j+1);
            scanf("%d", &matriz[i][j]);
        }
    }

    int soma = 0;
    for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++) {
            if (i == j) {
                soma+= matriz[i][j];
            }
        }
    }

    printf("A soma da diagonal principal eh: %d", soma);

    return 0;
}
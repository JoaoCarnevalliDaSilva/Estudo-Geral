#include <stdio.h>

int main(void) {

    int l, c;
    printf("Digite um valor para as linhas e colunas, respectivamente: \n");
    scanf("%d%d", &l, &c);
    if (l<1 || l>10 || c<1 || c>10) {
        printf("Valor invalido. Deve ser de 1 a 10.");
        return 1;
    }

    int matrizA[l][c];
    int matrizB[l][c];
    int matrizC[l][c];
    for (int i=0; i<l; i++) {
        for (int j=0; j<c; j++) {
            printf("Digite um valor para a linha %d e coluna %d: \n", i+1, j+1);
            scanf("%d", &matrizA[i][j]);
        }
    }

    for (int i=0; i<l; i++) {
        for (int j=0; j<c; j++) {
            printf("Digite um valor para a linha %d e coluna %d: \n", i+1, j+1);
            scanf("%d", &matrizB[i][j]);
        }
    }

    for (int i=0; i<l; i++) {
        for (int j=0; j<c; j++) {
            matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            printf("%d ", matrizC[i][j]);
        }
        printf("\n");
    }

    return 0;
}
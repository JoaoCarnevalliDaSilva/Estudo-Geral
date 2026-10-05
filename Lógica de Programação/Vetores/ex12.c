#include <stdio.h>

int main(void) {

    int l, c;
    printf("Digite um valor para as linhas e colunas, respectivamente: \n");
    scanf("%d%d", &l, &c);
    if (l < 1 || l > 10 || c < 1 || c > 10) {
        printf("Valores invalidos, deve ser de 1 a 10.");
        return 1;
    }
    int matriz[l][c];
    for (int i=0; i<l; i++) {
        for (int j=0; j<c; j++) {
            printf("Digite um valor para a linha %d e coluna %d: \n", i+1,j+1);
            scanf("%d", &matriz[i][j]);
        }
    }

    for (int i=0; i<c; i++) {
        for (int j=0; j<l; j++) {
            printf("%d ", matriz[j][i]);
        }
        printf("\n");
    }

    return 0;
}
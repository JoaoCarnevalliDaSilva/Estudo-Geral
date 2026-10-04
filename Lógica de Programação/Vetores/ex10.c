#include <stdio.h>

int main(void) {

    int l, c;
    printf("Digite quantas linhas e colunas vc deseja, respectivamente: \n");
    scanf("%d%d", &l, &c);
    if (l < 1 || l > 10 || c < 1 || c > 10) {
        printf("Valor invalido. Deve ser de 1 a 10.");
        return 1;
    }

    int matriz[l][c];
    for (int i=0; i<l; i++) {
        for (int j=0; j<c; j++) {
            printf("Digite um valor para a linha %d e coluna %d\n", i+1, j+1);
            scanf("%d", &matriz[i][j]);
        }
    }


    for (int i=0; i<l; i++) {
        int maior = matriz[i][0];
        for (int j=0; j<c; j++) {
            if (maior < matriz[i][j]) {
                maior = matriz [i][j];
            }
        }
        printf("Maior da linha %d: %d\n", i+1, maior);
    }
    return 0;
}
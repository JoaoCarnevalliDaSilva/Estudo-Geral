#include <stdio.h>

int main(void) {

    int linha, coluna;
    printf("Digite a quantidade de linhas e colunas respectivamente: \n");
    scanf("%d%d", &linha, &coluna);
    if (linha < 1 || coluna > 10) {
        printf("Valores invalidos");
        return 1;
    }
    int matriz[linha][coluna];
    for (int i=0; i<linha; i++) {
        for (int j=0; j<coluna; j++) {
            printf("Digite um valor para a posicao: Linha %d e Coluna %d\n", i+1, j+1);
            scanf("%d", &matriz[i][j]);
        }
    }
    int soma = 0;
    for (int i=0; i<linha; i++) {
        for (int j=0; j<coluna; j++) {
            soma += matriz[i][j];
        }
    }

    printf("Soma: %d", soma);

    return 0;
}
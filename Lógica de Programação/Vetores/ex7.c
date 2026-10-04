#include <stdio.h>

int main(void) {

    int n;
    printf("Digite o tamanho do vetor: \n");
    scanf("%d", &n);
    if (n <= 0 || n > 100) {
        printf("Valor invalido");
        return 1;
    }

    int x[n];
    for (int i = 0; i<n;i++) {
        printf("Digite um valor para a posicao: %d\n", i+1);
        scanf("%d", &x[i]);
    }

    int localizador = 0;
    printf("Digite o valor que voce procura: \n");
    scanf("%d", &localizador);
    int posicao = -1;
    int achou = 0;
    for (int i=0; i<n ; i++) {
        if (x[i] == localizador) {
            posicao = i;
            achou = 1;
            break;
        }
    }

    if (achou) {
        printf("Encontrado na posicao: %d", posicao+1);
    } else {
        printf("Valor nao encontrado.");
    }

    return 0;
}
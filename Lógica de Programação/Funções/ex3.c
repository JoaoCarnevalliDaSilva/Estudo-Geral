#include <stdio.h>

float calcular_media(int n, int vetor[]);
int contar_acima_da_media(int n, int vetor[], float media);

int main(void) {

    int n;
    printf("Digite o tamanho do vetor desejado: \n");
    scanf("%d", &n);
    if (n < 1 || n > 100) {
        printf("Valor invalido. Deve ser entre 1 e 100");
        return 1;
    }
    int vetor[n];
    float resMedia = calcular_media(n, vetor);
    int resAcima = contar_acima_da_media(n, vetor, resMedia);
    printf("Media: %.2lf\n", resMedia);
    printf("Acima da media: %d", resAcima);
    return 0;
}

float calcular_media(int n, int vetor[]) {
    int soma = 0, media = 0, quant = 0;
    for (int i=0; i<n; i++) {
        printf("Digite um valor para a posicao %d: \n", i+1);
        scanf("%d", &vetor[i]);
    }
    for (int i=0; i<n; i++) {
        soma += vetor[i];
        quant++;
    }
    media = (float)soma / quant;
    return media;
}
int contar_acima_da_media(int n, int vetor[], float media) {
    int qua = 0;
    for (int i=0; i<n; i++) {
        if (vetor[i] > media) {
            qua++;
        }
    }
    return qua;
}
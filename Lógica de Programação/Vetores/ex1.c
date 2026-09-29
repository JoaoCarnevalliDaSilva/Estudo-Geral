#include <stdio.h>

int main(void) {

    float a, b;
    printf("Digite dois valores aleatorios: \n");
    scanf("%f%f",&a,&b);
    float media = (a+b)/2;
    printf("A media eh: %.2lf", media);
    return 0;
}
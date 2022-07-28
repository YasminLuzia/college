#include <stdio.h>

int main()
{
    int numeroX;
    int resultado;

    printf("Digite o valor de X: ");

    scanf("%d", &numeroX);

    resultado = (3*numeroX)+2;
    
    printf("O resultado da funcao 3x+2, com o X de valor %d é %d", numeroX, resultado);
    getche();
    return 0;
}
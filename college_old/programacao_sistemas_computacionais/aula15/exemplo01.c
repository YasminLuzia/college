#include <stdio.h>

int main()
{
    int matriz[5][10];
    int valor = 1;

    // Preencendo a matriz
    for (int i = 0; i < 5; i++)
    {
        for (int n = 0; n < 10; n++)
        {
            matriz[i][n] = valor;
            valor++;
        }
    }

    // Mostra a matriz em grade
    printf("\n--------------------------------------------------------------------------------\n");
    for (int i = 0; i < 5; i++)
    {
        for (int n = 0; n < 10; n++)
        {
            if (matriz[i][n] < 10) printf("|  0%i  |", matriz[i][n]); 
            else printf("|  %i  |", matriz[i][n]);
        }
        printf("\n--------------------------------------------------------------------------------\n");
    }

    return 0;
}

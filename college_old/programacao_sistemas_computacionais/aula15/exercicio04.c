#include <stdio.h>

#define MATRIZX 5
#define MATRIZY 5

int main()
{
    int matriz[MATRIZX][MATRIZY], linha3 = 0, coluna4 = 0, diagonal1 = 0, diagonal2 = 0, somaTotal = 0;

    for (int i = 0; i < MATRIZX; i++)
    {
        for (int n = 0; n < MATRIZY; n++)
        {
            printf("Preencha a posicao [%i, %i] na matriz: ", i, n);
            scanf("%i", &matriz[i][n]);
            somaTotal += matriz[i][n];

            // Pega todos numeros que estiverem na posicaoX 2 e soma seus valores
            if (i == 2)
            {
                linha3 += matriz[i][n];
            }

            // Pega todos numeros que estiverem na posicaoY 3 e soma seus valores
            if (n == 3)
            {
                coluna4 += matriz[i][n];
            }

            // Se o numero da linha for igual o da coluna soma os valores
            if (i == n)
            {
                diagonal1 += matriz[i][n];
            }

            // Se for o primeiro algarismo e se for o ultimo algarismo de forma crescente e decrescente soma os numeros
            // cont 2--
            // for 0++
            int count = MATRIZX;
            for (int i = 0; i < count; i++)
            {
                
            }



        }
    }

    printf("\nMATRIZ:");
    printf("\n--------------------------------------\n");
    for (int i = 0; i < MATRIZX; i++)
    {
        for (int n = 0; n < MATRIZY; n++)
        {
            if (matriz[i][n] < 10)
                printf("|  0%i  |", matriz[i][n]);
            else
                printf("|  %i  |", matriz[i][n]);
        }
        printf("\n--------------------------------------\n");
    }

    printf("\nSoma da linha 3: %i", linha3);
    printf("\nSoma da coluna 4: %i", coluna4);
    printf("\nSoma da diagonal 1: %i", diagonal1);
    printf("\nSoma da diagonal 2: %i", diagonal2);
    printf("\nSoma total: %i", somaTotal);

    return 0;
}
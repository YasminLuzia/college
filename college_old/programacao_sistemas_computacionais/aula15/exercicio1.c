/**
 * @file exercicio1.c
 * @author Yasmin L
 * @brief Faça um programa leia um matriz 3x3. Em seguida, exiba a soma dos elementos de cada uma das linhas ;
 * @version 0.1
 * @date 2022-04-29
 * 
 * @copyright Copyright (c) 2022
 * 
 */
#include <stdio.h>
#define MATRIZX 3
#define MATRIZY 3

int main()
{
    int matriz[MATRIZX][MATRIZY], total = 0, soma;

    for (int i = 0; i < MATRIZX; i++)
    {
       for (int n = 0; n < MATRIZY; n++)
       {
         printf("Preencha a posicao [%i, %i] na matriz:", i, n);
         scanf("%i", &matriz[i][n]);
         total+=matriz[i][n];
       }
    }

    printf("\nMATRIZ:");
    printf("\n-------------------------\n");
    for (int i = 0; i < MATRIZX; i++)
    {
        soma=0;
        for (int n = 0; n < MATRIZY; n++)
        {
            soma+=matriz[i][n];
            if (matriz[i][n] < 10) printf("|  0%i  |", matriz[i][n]); 
            else printf("|  %i  |", matriz[i][n]);
        }
        printf(" = %i", soma);
        printf("\n-------------------------\n");
    }
    
    printf("A soma dos valores da matriz eh: %i", total);

    return 0;
}

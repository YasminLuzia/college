/**
 * @file exercicio04.c
 * @author Yasmin
 * @brief Crie um novo vetor para armazenar as posicoes dos elementos pares do vetor. Exiba esse novo vetor.
 * @version 0.1
 * @date 2022-04-08
 * 
 * @copyright Copyright (c) 2022
 * 
 */

#include <stdio.h>

#define QUANTIDADE 10

int main()
{
    int i, numeros[QUANTIDADE];

    // For para adquirir todos os numeros digitados pelo usuario
    for (i = 0; i < QUANTIDADE; i++)
    {
        printf("\nDigite o numero %i: ", i + 1);
        scanf("%i", &numeros[i]);
    }

    printf("\nPosicao dos numeros pares digitados:");
    for (i = 0; i < QUANTIDADE; i++)
    {
        if (numeros[i] % 2 == 0)
        {
            printf(" %i", i+1);
        }
    }
    
    return 0;
}
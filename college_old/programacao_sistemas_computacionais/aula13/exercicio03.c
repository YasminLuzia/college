/**
 * @file exercicio03.c
 * @author Yasmin
 * @brief Faça um algoritmo que leia um vetor de 10 posições de inteiros e mostre a(s) posiçao(ões) onde se encontram os números pares 
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

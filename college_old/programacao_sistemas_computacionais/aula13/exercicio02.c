/**
 * @file exercicio02.c
 * @author Yasmin
 * @brief 2. Crie um algoritmo que armazene em um vetor 10 números inteiros .  Após, exiba a soma de números pares e a soma dos números ímpares constantes no vetor.
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
    int somaPares = 0, somaImpares = 0, i, numeros[QUANTIDADE];

    // For para adquirir todos os numeros digitados pelo usuario
    for (i = 0; i < QUANTIDADE; i++)
    {
        printf("\nDigite o numero %i: ", i + 1);
        scanf("%i", &numeros[i]);
    }

    // For para somar os numeros impares e pares
    for (i = 0; i < QUANTIDADE; i++)
    {
        if (numeros[i] % 2 != 0)
        {
            somaImpares += numeros[i];
        }
        else
        {
            somaPares += numeros[i];
        }
    }
    

    printf("\nSoma dos numeros pares digitados: %i", somaPares);
    printf("\nSoma dos numeros impares digitados: %i", somaImpares);

    return 0;
}

/**
 * @file exercicio03.c
 * @author Yasmin
 * @brief Escreva um algoritmo que determine o fatorial de um número informado pelo usuário. Para este problema, tem-se como entrada o valor do número do qual se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O fatorial de um número N(N!) é definido conforme a seguir: N! = 1 * 2 * 3 * 4 * ... * (N-1) * N
 * @version 0.1
 * @date 2022-04-01
 *
 * @copyright Copyright (c) 2022
 *
 */

#include <stdio.h>

int main()
{
    int valor, fatorial = 1;

    printf("Insira um numero: ");
    scanf("%i", &valor);

    for (int i = 2; i <= valor; i++)
    {
        fatorial = fatorial * i;
    }
    printf("O fatorial do numero inserido e %d", fatorial);
    return 0;
}
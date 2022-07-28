/**
 * @file exercicio02.c
 * @author Yasmin
 * @brief Faça um algoritmo que imprima todos os números pares compreendidos entre 85 e 907. O algoritmo deve também calcular a soma e exibir a quantidade destes valores.
 * @version 0.1
 * @date 2022-04-01
 *
 * @copyright Copyright (c) 2022
 *
 */

#include <stdio.h>

int main()
{
    int soma = 0, quantidade = 0;

    for (int i = 85; i <= 907; i++)
    {
        if (i % 2 == 0)
        {
            soma += i;
            quantidade++;
            printf("%i \n", i);
        }
    }

    printf("Soma: %i \n", soma);
    printf("Numeros entre 85 e 907 que sao pares: %i \n", quantidade);

    return 0;
}
/**
 * @file exercicio04.c
 * @author Yasmin
 * @brief Construa uma algoritmo que o usuário informa 5 valores, ao final o  algoritmo imprime o maior e o menor valor inserido e a média dos valores
 * @version 0.1
 * @date 2022-04-01
 *
 * @copyright Copyright (c) 2022
 *
 */

#include <stdio.h>

int main()
{
    int i, min, max, valor, soma = 0;

    for (i = 1; i <= 5; i++)
    {
        printf("Informe %d° valor: ", i);
        scanf("%i", &valor);

        if (i == 1)
        {
            min = valor;
            max = valor;
        }

        // Ternario
        valor < min ? min = valor : 0;
        valor > max ? max = valor : 0;

        soma+=valor;
    }

    printf("Maior valor: %d \n"
    "Menor valor: %d \n"
    "Media: %.3f \n", min, max, (soma / 5.0));

    return 0;
}
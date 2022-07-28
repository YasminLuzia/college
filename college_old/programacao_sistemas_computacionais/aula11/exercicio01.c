/**
 * @file exercicio01.c
 * @author Yasmin
 * @brief Some os números de 1 a 100 e imprima o valor.
 * @version 0.1
 * @date 2022-04-01
 *
 * @copyright Copyright (c) 2022
 *
 */
#include <stdio.h>

int main()
{
    int soma = 0;

    for (int i = 1; i <= 100; i++)
    {
        soma += i;
        printf("%d \n", soma);
    }

    return 0;
}
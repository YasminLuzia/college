/**
 * 
 * @file exercicio01.c
 * @author Yasmin
 * @brief 1. Crie um algoritmo que armazene em um vetor a idade de 5 pessoas.  Em seguida, informe a idade da pessoa nas posições 0 , 3 e 4 do vetor.
 * @version 0.1
 * @date 2022-04-08
 * 
 * @copyright Copyright (c) 2022
 * 
 */

#include <stdio.h>

int main()
{
    int idades[5];
    
    for(int i = 0; i < 5; i++) {
        printf("\nDigite a %i idade: ", i+1);
        scanf("%i", &idades[i]);
    }

    printf("\nIdade na posicao 1: %i", idades[0]);
    printf("\nIdade na posicao 4: %i", idades[3]);
    printf("\nIdade na posicao 5: %i", idades[4]);
    
    return 0;
}

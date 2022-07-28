/*
Laço de Repetição
1. Chico tem 1,50 metros e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e
cresce 3 centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos
serão necessários para que Zé seja maior que Chico.

*/

#include <stdio.h>

int main()
{
    float chico = 1.5, ze = 1.1;
    int ano = 0;

    while (ze<=chico)
    {
        ze+=0.03;
        chico+=0.02;
        ano++;
    }

    printf("Levará %d anos para que Zé seja maior que Chico", ano );

    getche();
    return 0;
}

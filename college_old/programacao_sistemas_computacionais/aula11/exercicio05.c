/**
 * @file exercicio05.c
 * @author Yasmin
 * @brief Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria qualquer preço. O monge, necessitando de alimentos, indagou à rainha sobre o pagamento, se poderia ser feito com grãos de trigo dispostos em um tabuleiro de 32 casas, de tal forma que o primeiro quadro deveria conter apenas um grão e os quadros subsequentes, o dobro do quadro anterior. Crie um algoritmo para calcular o total de grãos que o monge recebeu.
 * @version 0.1
 * @date 2022-04-03
 * 
 * @copyright Copyright (c) 2022
 * 
 */

#include <stdio.h>

int main()
{
    float graos = 1, total = 0;

    for(int casas = 1; casas<=32; casas++) {
        printf("Graos por casas: %.2f\n", graos);
        total+=graos;
        graos+=graos;
    }
    printf("Total de Graos: %.2f\n", total);

    return 0;
}

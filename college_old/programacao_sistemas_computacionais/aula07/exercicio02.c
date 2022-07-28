/*
Elabore um programa que solicite ao usuário que digite 2 números inteiros e após ele
escolha uma operação à realizar, conforme segue:
A - Adição
S - Subtração
M - Multiplicação
D - Divisão
Mostrar o resultado da operação realizada.
*/

#include <stdio.h>

int main()
{
    int n1;
    int n2;
    float result = 0;
    char operador;
    printf("Informe o primeiro valor: ");
    scanf("%d", &n1 );
    printf("Informe o segundo valor: ");
    scanf("%d", &n2 );

    printf( "A - Adicao \n");
    printf( "S - Subtracao \n");
    printf( "M - Multiplicacao \n");
    printf( "D - Divisao \n");
    printf( "Informe qual operacao realizar: ");
    scanf("%s", &operador);

    switch( operador ){
        case 'A': 
            result = n1 + n2;
            break;
        case 'S': 
            result = n1 - n2;
            break;
        case 'M': 
            result = n1 * n2;
            break;
        case 'D': 
            result = n1 / n2;
            break;
        default:
            // result = 0 ;
            printf("Operador nao encontrado!");
    }
    printf("Resultado: %f", result);

    printf("\nDigite ENTER para encerrar a aplicacao.");
    getch();
    return 0;
}
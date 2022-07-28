/*
Escreva um algoritmo utilizando Switch, onde o usuário informe a nota de uma aluno (de 0 a 100).
• De 60 até 100: mensagem de Aprovado
• De 20 at 59 :mensagem de Recuperação, mas pode fazer recuperação
• De 0 até 19: mensagem de Reprovado

*/

#include <stdio.h>

int main()
{
    int nota;

    printf("Digite a nota do aluno: \n");
    scanf("%d", &nota);

    switch (nota)
    {
    case 60 ... 100:
        printf("Aprovado.");
        break;
    case 20 ... 59:
        printf("Recuperacao.");
        break;
    case 0 ... 19:
        printf("Reprovado.");
        break;
    default:
        printf("Nota invalida.");
    }

    printf("\nDigite ENTER para fechar.");
    getch();
    return 0;
}

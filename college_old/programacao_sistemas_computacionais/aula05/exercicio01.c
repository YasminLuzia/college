// Escreva um algoritmo onde o usuario informe a nota de um aluno de 0 a 100
// Nota >= 60 : Mensagem de aprovado
// Nota >= 20 : Mensagem de Recuperacao
// Nota de 0 > 20 : Mensagem de reprovado

#include <stdio.h>

int main()
{
    int nota;

    printf("Digite a nota do aluno: ");
    scanf("%d", &nota);

    if (nota>=60 && nota<=100)
    {
        printf("Aluno aprovado.");
    } else {
        if (nota<60 && nota>=0)
        {
            printf("Aluno de recuperação.");
        } else {
            printf("Nota inválida");
        }
    }
    
    getch();
    return 0;
}

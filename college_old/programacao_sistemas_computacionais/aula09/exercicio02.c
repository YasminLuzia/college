/*
Foi realizada uma pesquisa de algumas características físicas da população de uma certa região, a qual coletaram os seguintes dados referentes a cada habitante para serem analisados:
    sexo (masculino e feminino)
    idade
Faça um algoritmo que determine e escreva:
    a maior idade dos habitantes;
    a quantidade de indivíduos do sexo feminino cuja idade está entre 18 e 35 anos, inclusive;
O final do conjunto de habitantes é reconhecido pelo valor -1 informado como
idade.
*/

#include <stdio.h>

int main()
{
    int sexo, idade=0, maiorIdade=0, feminino18a35=0;

    while (idade!=-1)
    {
        printf("\nDigite a idade do habitante (-1 para sair do programa)\n==> ");
        scanf("%i", &idade);

        if(idade==-1) {
            break;
        }

        printf("Digite o sexo do habitante:" 
        "\n1 - Masculino"
        "\n2 - Feminino\n==>");
        scanf("%i", &sexo);

        if(sexo==2 && idade>=18 && idade<=35) {
            feminino18a35++;
        }

        if(idade>maiorIdade){
            maiorIdade = idade;
        }

    }

    printf("A maior idade informadas e %d e exitem %d habitantes do sexo feminino entre 18 e 35 anos de idade.", maiorIdade, feminino18a35);

    getche();
    return 0;
}

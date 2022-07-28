/*
Suponha que você atrasou uma conta. A cada mês que você deixa de pagar, será cobrado
1% de juros no valor inicial. Ou seja, se você atrasar um mês, irá pagar 1%. Se atrasar 3
meses, irá pagar 3% etc. Vamos supor que você pode atrasar, no máximo, 5 meses.
O programa pede, como entrada, dois valores:
O valor de sua dívida inicial e a quantidade de meses de atraso (no máximo 5). Faça um
programa em C que calculo o juros de atraso. Use switch e case acumulados. É permitida a
utilização de SOMENTE 1 COMANDO BREAK.
*/
#include <stdio.h>

int main()
{
    float dividaInicial, dividaFinal;
    int meses, juros;

    printf("Digite a sua divida: ");
    scanf("%f", &dividaInicial);
    printf("Digite os meses de atraso (ate 5): ");
    scanf("%d", &meses);

    switch (meses)
    {
    case 5:
        juros++;
    case 4:
        juros++;
    case 3:
        juros++;
    case 2:
        juros++;
    case 1:
        juros++;
        break;
    default:
        printf("Erro.");
    }

    printf("Juros: %d% \n", juros);
    dividaFinal = ((1 + (juros / 100.0)) * dividaInicial);
    printf("Valor final da dívida: R$ %.2f\n", dividaFinal);

    printf("Pressione ENTER para sair.");
    getch();
    return 0;
}
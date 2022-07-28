#include <stdio.h>

int main()
{
    int num, cont;

    printf("Por favor, informe um numero: ");
    scanf("%i", &num);

    printf("Numeros multiplos de 3 e 5 encontrados: ");
    for (cont = 1; cont <= num; cont++)
    {
        if (cont % 3 == 0 && cont % 5 == 0)
        {
            printf("%i ", cont);
        }
    }
    return 0;
}
#include <stdio.h>

int main()
{
    int valor, soma=0;
    
    do
    {
        printf("Digite um valor inteiro (0 encera o programa): ");
        scanf("%d", &valor);

        soma+=valor;

    } while (valor != 0);
    
    printf("A soma dos valores informados eh %d", soma);

    return 0;
}

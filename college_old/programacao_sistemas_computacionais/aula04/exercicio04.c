#include <stdio.h>

int main()
{
    float x;
    printf("Digite um numero: ");
    scanf("%f", &x);

    if(x>10){
        printf("O numero é maior que 10");
    } else if(x<10){
        printf("O numero é menor que 10.");
    } else {
        printf("O numero é igual a 10.");
    }

    getche();
    return 0;
}
#include <stdio.h>

int main()
{
    float temperaturaC, temperaturaF;

    printf("Digite uma temperatura em Celsius para converte-la em Fahrenheit: ");
    scanf("%f", &temperaturaC);

    temperaturaF = temperaturaC*9/5+32;

    printf("A temperatura %f.2C é equivalente a %f.2F.", temperaturaC, temperaturaF);
    getche();
    return 0;
}
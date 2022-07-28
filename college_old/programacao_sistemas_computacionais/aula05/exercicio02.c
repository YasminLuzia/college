

#include <stdio.h>

int main()
{
    float salario, imposto;
    printf("Calculadora de imposto de renda Março de 2022\n");
    printf("Até 1903,98: Isento\n");
    printf("De 1903,99 até 2826,65: 7,5\% com parcela do IRPF de 142,80\n");
    printf("De 2826,66 até 3751,05: 15\% com parcela do IRPF de 354,80\n");
    printf("De 3751,06 até 4664,68: 22,5\% com parcela do IRPF de 636,13\n");
    printf("Acima de 4664,68: 27,5\% com parcela do IRPF de 869,36\n");
    printf("Digite seu salário recebido: ");

    scanf("%f", &salario);

    if (salario<=1903.98)
    {
        printf("Voce esta isento de IRPF!");
    } else {
        if (salario>1903.98 && salario<=2826.65)
        {
            imposto = salario*0.075-142.80;
        } else {
            if (salario<=3751.05)
            {
                imposto = salario*0.15-354.80;
            } else {
                if (salario<=4664.68)
                {
                    imposto = salario*0.225-636.13;
                } else {
                    if (salario>4664.68)
                    {
                        imposto = salario*0.275-869.36;
                    } else {
                        printf("Salário inválido.");
                    }
                }
            }
        }
        printf("O imposto a pagar é de: R$ %.2f", imposto);
    }
    
    getch();
    return 0;
}

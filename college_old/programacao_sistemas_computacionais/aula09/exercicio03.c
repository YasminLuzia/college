/*
Faça um programa que leia o código dos produtos pedidos e as quantidades desejadas;
calcule e mostre o valor a ser pago por produto (preço * quantidade) e o total do pedido.
Considere que o cliente deve informar quando o pedido deve ser encerrado.

Produto             |  Código   |   Preço (unitário)
Cachorro quente     |    1      |     R$ 1,50
Hamburger           |    2      |     R$ 2,00
Cheeseburger        |    3      |     R$ 2,50
Eggcheeseburger     |    4      |     R$ 3,00
Refrigerante        |    5      |     R$ 1,50
*/

#include <stdio.h>

int main()
{
    int codigo, quantidade, fim;
    float subtotal, total=0;

    do
    {
        printf("Digite o codigo do produto desejado: "
            "\nProduto             |  Codigo   |   Preco (unitario)"
            "\nCachorro quente     |    1      |     R$ 1,50"
            "\nHamburger           |    2      |     R$ 2,00"
            "\nCheeseburger        |    3      |     R$ 2,50"
            "\nEggcheeseburger     |    4      |     R$ 3,00"
            "\nRefrigerante        |    5      |     R$ 1,50\n"
        );
        scanf("%i", &codigo);

        printf("Digite a quantidade desejada do produto selecionado: ");
        scanf("%i", &quantidade);

        switch (codigo)
        {
        case 1:
            subtotal = 1.5*quantidade;
            break;
        case 2:
            subtotal = 2*quantidade;
            break;
        case 3:
            subtotal = 2.5*quantidade;
            break;
        case 4:
            subtotal = 3*quantidade;
            break;
        case 5:
            subtotal = 1.5*quantidade;
            break;
        default: printf("\nCODIGO INVALIDO");
        }

        printf("\nSubtotal do pedido: R$ %f \n", subtotal);

        total+=subtotal;

        printf("Total dos pedidos: R$ %f", total);

        printf("Deseja continuar suas compras? \n0 - Nao \n1 - Sim\n");
        scanf("%i", &fim);
        if (fim==0)
        {
            break;
        }
    } while (fim!=0);

    getche();
    return 0;
}

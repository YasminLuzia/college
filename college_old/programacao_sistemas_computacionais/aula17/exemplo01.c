#include <stdio.h>
#include <stdlib.h>

int menu()
{
    int opcao = 0;
    system("cls");
    printf("\n ---- Calculadora ---- \n");
    printf("| 1 - Somar           | \n");
    printf("| 2 - Subtrair        | \n");
    printf("| 3 - Multiplicar     | \n");
    printf("| 4 - Dividir         | \n");
    printf("| 0 - Sair         | \n");
    printf(" --------------------- \n");
    printf("Informe sua Opção: ");
    scanf("%d", &opcao);
    return opcao;
}

int somar(int valor1, int valor2)
{
    int resultado = valor1 + valor2;
    return resultado;
}

int subtrair(int valor1, int valor2)
{
    int resultado = valor1 - valor2;
    return resultado;
}

int multiplicar(int valor1, int valor2)
{
    int resultado = valor1 * valor2;
    return resultado;
}

float dividir(int valor1, int valor2)
{
    float resultado = valor1 / valor2;
    return resultado;
}

int ler(int posicao)
{
    int valor;
    printf("\nDigite o %d valor: ", posicao);
    scanf("%i", &valor);
    return valor;
}

int main()
{
    int op = -1;
    float result = 0;
    do{
        op = menu();
        int valor1, valor2;
        
        if( op == 0 ){
            printf("\nAté logo!!!");
            break;
        }else if( op > 0 && op < 5 ) {
            valor1 = ler( 1 );
            valor2 = ler( 2 );
        }
        
        
        switch( op ){
            case 1:
                result = somar( valor1 , valor2 );
                break;
            case 2: 
                result = subtrair( valor1 , valor2 );
                break;
            case 3: 
                result = multiplicar( valor1 , valor2 );
                break;
            case 4: 
                result = dividir( valor1 , valor2 );
                break;
            case 0:
                break;
            default:
                printf("\nOpção inválida!");
        }
        
        printf("\nResultado: %f", result);
        
        fflush(stdin);
        getchar();
        system("clear");
    }while( op != 0 );

    return 0;
}
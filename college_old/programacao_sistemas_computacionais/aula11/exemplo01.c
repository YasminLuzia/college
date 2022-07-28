#include <stdio.h>

int main()
{
    int i;
    for (i = 1; i <= 10; i++)
    {
        printf("%d", i);
    }
    printf("\n-------------------------\n");
    for (int j = 10; j > 0; j--)
    {
        printf("%d", j);
    }

    return 0;
}
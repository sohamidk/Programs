#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iMask = 0xFFFFFFFF;


    printf("Before : %X",iMask);
     printf("\n");
    iMask = ~iMask;

    printf("After : %X",iMask);
    printf("\n");
    return 0;
}
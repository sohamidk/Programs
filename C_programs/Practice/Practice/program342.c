#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    //1 0 1 1 0 0 0 0
    UINT iMask = 0xFFFFFFBF;


    printf("Before : %X",iMask);
    printf("\n");
    iMask = ~iMask;

    printf("After : %X",iMask);
    printf("\n");
    return 0;
}
#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkZero(int iNo)
{
    int iDigit = 0;
    while(iNo != 0)
    {
        iDigit = iDigit % 10;
        if(iDigit == 0)
        {
            return TRUE;
        }
        else
        {
            return FALSE;
        }
    }
}

int main()
{
    int iValue = 0;
    BOOL bRet = FALSE;

    printf("Enter a number : ");
    scanf("%d", &iValue);

    bRet = ChkZero(iValue);

    if(bRet == TRUE)
    {
        printf("It contains Zero");
    }
    else
    {
        printf("It does not contains Zero");
    }
    return 0;
}
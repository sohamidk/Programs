#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;
BOOL ChkBit(int iNo)
{
    int iMask = 0x4000;     //15th bit
    int iAns = 0;

    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}
int main()
{
    int iValue = 0;
    BOOL bRet = FALSE;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    bRet = ChkBit(iValue);
    if(bRet == TRUE)
    {
        printf("15th Bit is ON \n");
    }
    else
    {
        printf("15th Bit is OFF \n");
    }
    return 0;
}
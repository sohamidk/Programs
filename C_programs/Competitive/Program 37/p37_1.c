#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef unsigned int UNIT;
typedef int BOOL;
BOOL ChkBit(UNIT iNo, UNIT iPos)
{
    UNIT iMask = 0x1;    
    UNIT iAns = 0;
    
    iMask = iMask << (iPos -1);

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
    UNIT iValue = 0;
    UNIT iLocation = 0;
    BOOL bRet = FALSE;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    printf("Enter Position : ");
    scanf("%d",&iLocation);

    bRet = ChkBit(iValue,iLocation);

    if(bRet == TRUE)
    {
        printf("TRUE\n");
    }
    else
    {
        printf("FALSE\n");
    }
    return 0;
}
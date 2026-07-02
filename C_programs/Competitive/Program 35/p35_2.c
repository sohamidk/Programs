#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;
BOOL ChkBit(int iNo)
{
    int iMask1 = 0x20000;   //18th bit
    int iMask2 = 0x10;      //5th bit
    int iMask= 0;
    int iAns = 0;
    
    iMask = iMask1 | iMask2 ;

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
        printf("5th & 18th Bit is ON \n");
    }
    else
    {
        printf("5th & 18th Bit is OFF \n");
    }
    return 0;
}
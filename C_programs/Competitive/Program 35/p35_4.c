#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef unsigned int UNIT;
typedef int BOOL;

BOOL ChkBit(UNIT iNo)
{
    UNIT iMask1 = 0x40;        //7th
    UNIT iMask2 = 0x80;      //8th
    UNIT iMask3 = 0x100;    //9th
    UNIT iMask= 0;
    UNIT iAns = 0;
    
    iMask = iMask1 | iMask2 |iMask3;

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
        printf("7th,8th & 9th Bit is ON \n");
    }
    else
    {
        printf("7th,8th & 9th Bit is OFF \n");
    }
    return 0;
}
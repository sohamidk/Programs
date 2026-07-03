#include<stdio.h>

typedef unsigned int UNIT;
UNIT OffBit(UNIT iNo)
{
    UNIT iMask1 = 0x40;
    UNIT iMask2 = 0x200;
    UNIT iMask = 0;
    UNIT iResult = 0;

    iMask = iMask1 | iMask2;

    iResult = iNo ^ iMask;

    return iResult;
}
int main()
{
    UNIT iValue = 0; 
    UNIT iRet = 0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    iRet = OffBit(iValue);
    printf("Modified Bit is : %d\n",iRet);

    return 0;
}
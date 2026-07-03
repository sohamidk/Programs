#include<stdio.h>

typedef unsigned int UNIT;
UNIT OffBit(UNIT iNo)
{
    UNIT iMask = 0x40;
    UNIT iResult = 0;

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
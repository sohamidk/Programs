#include<stdio.h>

typedef unsigned int UNIT;
UNIT OnBit(UNIT iNo)
{
    UNIT iMask = 0xf;
    UNIT iResult = 0;

    

    iResult = iNo | iMask;

    return iResult;
}
int main()
{
    UNIT iValue = 0; 
    UNIT iRet = 0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    iRet = OnBit(iValue);
    printf("Modified Bit is : %d\n",iRet);

    return 0;
}
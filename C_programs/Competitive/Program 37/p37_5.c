#include<stdio.h>

typedef unsigned int UNIT;
UNIT ToggleBit(UNIT iNo)
{
    UNIT iMask = 0x9;       //1st and 4th bit of first nibble
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

    iRet = ToggleBit(iValue);
    printf("Modified Bit is : %d\n",iRet);

    return 0;
}
#include<stdio.h>

typedef unsigned int UINT;
// position of bit is 4
UINT OffBit(UINT iNo, UINT iPos)
{
    
    int iMask = 0xfffffff7;
    int iResult = 0;
    if(iPos < 1 || iPos > 32)
    {
        printf("Invalid Bit Position\n");
        return iNo;
    }

    iResult = iNo & iMask;

    return iResult;

}

int main()
{
   
    UINT iValue = 0;
    UINT iRet = 0;
    UINT iLocation = 0;

    printf("Enter Number : ");
    scanf("%u",&iValue);

    printf("Enter the Bit Position : ");
    scanf("%d",&iLocation);

   
    iRet = OffBit(iValue, iLocation);
    printf("Updated Number is : %u\n", iRet);
    
  
    return 0;
}
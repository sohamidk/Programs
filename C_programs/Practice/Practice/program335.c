#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo, UINT iPos)
{
    
    int iMask = 0x1;
    int iResult = 0;
    if(iPos < 1 || iPos > 32)
    {
        printf("Invalid Bit Position\n");
        return iNo;
    }

    iMask = iMask << (iPos -1);     //Mask Creation

    iResult = iNo ^ iMask;

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

   
    iRet = ToggleBit(iValue, iLocation);
    printf("Updated Number is : %u\n", iRet);
    
  
    return 0;
}
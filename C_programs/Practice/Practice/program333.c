#include<stdio.h>

typedef unsigned int UINT;

//Dynamic Position
int main()
{
    UINT iMask = 0x1;
    UINT iNo = 0;
    UINT iPos = 0;


    printf("Enter Number : ");
    scanf("%u",&iNo);

    printf("Enter the Bit Position : ");
    scanf("%d",&iPos);

    iMask = iMask << (iPos-1);

    iNo = iNo ^ iMask;
    printf("Updated Number is : %u\n", iNo);
    
  
    return 0;
}
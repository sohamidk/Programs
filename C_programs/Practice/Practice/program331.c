#include<stdio.h>

typedef unsigned int UINT;

//Position of bit is 11th
int main()
{
    UINT iMask = 0;
    UINT iNo = 0;

    printf("Enter Number : ");
    scanf("%u",&iNo);

    iMask = 0x00000400;
    iNo = iNo ^ iMask;

    printf("Updated Number is : %u\n", iNo);
    
  
    return 0;
}
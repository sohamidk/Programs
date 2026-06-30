#include<stdio.h>

typedef unsigned int UINT;

//POSITION OF BIT IS 4
int main()
{
    UINT iMask = 0xFFFFFFF7;
    UINT iNo = 0;
    UINT iPos = 0;


    printf("Enter Number : ");
    scanf("%u",&iNo);


    iNo = iNo & iMask;
    printf("Updated Number is : %u\n", iNo);
    
  
    return 0;
}
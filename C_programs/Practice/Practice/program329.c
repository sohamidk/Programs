#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    //smallest value of int
    UINT iMask = 0xffffffff;
    printf("%u\t %X\n", iMask, iMask);
    
  
    return 0;
}
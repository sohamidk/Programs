#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iNo = 0;
    UINT iMask = 0x00010000;
    UINT iAns = 0;

    printf("Enter Number : ");
    scanf("%d",&iNo);
    
    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        printf("Seventeenth bit is on  \n");
    }
    else
    {
        printf("Seventeenth bit is off  \n");
    }

  
    return 0;
}
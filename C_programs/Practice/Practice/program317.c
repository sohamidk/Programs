#include<stdio.h>
//Dynamic Mask Design
typedef unsigned int UINT;

int main()
{
    UINT iNo = 0;
    UINT iMask = 1;
    UINT iAns = 0;
    UINT iPos = 0;

   printf("Enter Number : ");
   scanf("%d",&iNo);
    
    printf("Enter Position : ");
    scanf("%d",&iPos);
    
    iMask = iMask << (iPos -1);
    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        printf("Seventh bit is on  \n");
    }
    else
    {
        printf("Seventh bit is off  \n");
    }

  
    return 0;
}
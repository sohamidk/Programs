#include<stdio.h>

int main()
{
    unsigned int iNo = 0;
    unsigned int iMask = 4;
    unsigned int iAns = 0;

   printf("Enter Number : ");
   scanf("%d",&iNo);
    
    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        printf("Third bit is on  \n");
    }
    else
    {
        printf("Third bit is off  \n");
    }

  
    return 0;
}
#include<stdio.h>

int main()
{
   int iNo = 0, iCount = 0, iDigit = 0;


   printf("Enter Number : ");
   scanf("%d",&iNo);
    
    while(iNo != 0)
    {
        iDigit = iNo % 2;
        iCount = iCount + iDigit;
        iNo = iNo / 2;
    }
    printf("Count of 1's are : %d",iCount);
    printf("\n");
  
    return 0;
}
#include<stdio.h>
int  EvenFact(int iNo)
{
   int iCnt = 0;
   int iFact = 1;

   if(iNo < 0)
   {
    iNo = -iNo;
   }
   for(iCnt = 2; iCnt <= iNo; iCnt += 2)
   {
            iFact = iFact * iCnt;
   }
   return iFact;
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter a number : ");
    scanf("%d", &iValue);

    iRet = EvenFact(iValue);
    printf("Even Factorial of number is : %d \n",iRet);
    return 0;
}
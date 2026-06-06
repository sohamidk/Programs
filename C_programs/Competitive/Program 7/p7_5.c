#include<stdio.h>
int  FactDiff(int iNo)
{
   int iCnt = 0;
   int iFactOdd = 1;
   int iFactEven = 1;

   if(iNo < 0)
   {
    iNo = -iNo;
   }
   for(iCnt = 1; iCnt <= iNo; iCnt ++)
   {
        if(iCnt % 2 == 0)
        {
            iFactEven = iFactEven * iCnt;
        }
        else
        {
            iFactOdd = iFactOdd * iCnt;
        }
             
    }
    return iFactEven - iFactOdd;   
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter a number : ");
    scanf("%d", &iValue);

    iRet = FactDiff(iValue);
    printf("Factorial diffrence : %d \n",iRet);
    return 0;
}
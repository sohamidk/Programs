#include<stdio.h>
int RangeSum(int iStart, int iEnd)
{
    int iSum = 0;
    int iCnt = 0;
    if(iStart > iEnd)
    {
        printf("Invalid range\n");
        return 0;
    }
    else if(-iStart)
    {
        printf("Invalid range\n");
        return 0;
    }
   
    for(iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        iSum = iSum + iCnt;
    }
    return iSum;
}
int main()
{
    int iValue1 = 0, iValue2 = 0;
    int iRet = 0;
    printf("Enter Starting point : ");
    scanf("%d", &iValue1);

    printf("Enter Ending point : ");
    scanf("%d", &iValue2);
    
    iRet = RangeSum(iValue1, iValue2);
    printf("Addition of numbers is : %d\n", iRet);
    return 0;
}
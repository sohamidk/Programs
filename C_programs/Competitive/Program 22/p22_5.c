#include<stdio.h>

void Pattern(int iNo)
{
    int iCnt = 0;
    int iCount = 0;
    for(iCnt = 1, iCount = 1; iCnt <= iNo, iCount <= iNo; iCnt++)
    {
        if(iCnt % 2 == 0)
        {
             printf("%d \t",iCnt);
             iCount++;
        }
       
    }
}
int main()
{
    int iValue = 0;

    printf("Enter a number : ");
    scanf("%d", &iValue);

    Pattern(iValue);

    return 0;
}
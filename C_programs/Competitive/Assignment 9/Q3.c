#include<stdio.h>
int CountRange(int iNo)
{
    int iCnt = 0;
    int iDigit = 0;
    while(iNo > 0)
    {
        iDigit = iNo % 10;
        if(iDigit > 3 && iDigit < 7)
        {
            iCnt++;
        }
        iNo= iNo / 10;
    }
    return iCnt;
}
int main()
{

    int iValue = 0, iRet = 0;

    printf("Enter a Number : ");
    scanf("%d",&iValue);

    iRet = CountRange(iValue);
    printf("%d\n", iRet);
    return 0;
}
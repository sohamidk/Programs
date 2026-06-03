#include<stdio.h>
int MultiDigits(int iNo)
{
    int iMulti = 1;
    int iDigit = 0;
    while(iNo > 0)
    {
        iDigit = iNo % 10;
        iMulti = iMulti * iDigit;
        iNo= iNo / 10;
    }
    return iMulti;
}
int main()
{

    int iValue = 0, iRet = 0;

    printf("Enter a Number : ");
    scanf("%d",&iValue);

    iRet = MultiDigits(iValue);
    printf("%d\n", iRet);
    return 0;
}
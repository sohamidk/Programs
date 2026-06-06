#include<stdio.h>
int  DollarToINR(int iNo)
{
    int iNr = 0;
    int iDigit = 70;
    iNr = iNo * iDigit;

    return iNr;

}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter a number : ");
    scanf("%d", &iValue);

    iRet = DollarToINR(iValue);
    printf("Dollar to INR is : %d \n",iRet);
    return 0;
}
#include<stdio.h>
double SquareMeter(int iNo)
{
    double fRes = 0.0;
    float fDigit = 0.0929f;
    fRes = iNo * fDigit;

    return fRes;
}
int main()
{
    int iValue = 0;
    double dRet = 0.0;

    printf("Enter area in square feet : ");
    scanf("%d",&iValue);

    dRet = SquareMeter(iValue);
    printf("%lf\n", dRet);
    return 0;
}
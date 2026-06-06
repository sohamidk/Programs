#include<stdio.h>
double FhToCs(float fTemp)
{
    double fRes = 0.0;
    fRes = (fTemp - 32) * (5.0/9.0);

    return fRes;
}
int main()
{
    float fValue = 0.0;
    double dRet = 0.0;

    printf("Enter temperature in fahrenheit : ");
    scanf("%f",&fValue);

    dRet = FhToCs(fValue);
    printf("%lf\n", dRet);
    return 0;
}
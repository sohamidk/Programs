#include<stdio.h>

double CircleArea(float fRadius)
{
    float pI = 3.14f;
    double dArea = 0.0;

    dArea = pI * (fRadius * fRadius);

    return dArea;
}

int main()
{
    float fValue = 0.0;
    double dRet = 0.0;

    printf("Enter Radius : ");
    scanf("%f", &fValue);

    dRet = CircleArea(fValue);

    printf("%lf\n",dRet);
}
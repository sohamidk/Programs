#include<stdio.h>
int KMtoMeter(int iNo)
{
    int iConversion = iNo * 1000;
    return iConversion;
}
int main()
{
    int iValue = 0, iRet = 0;
    printf("Enter Distance : ");
    scanf("%d",&iValue);

    iRet = KMtoMeter(iValue);
    printf("%d\n",iRet);
    return 0;
}
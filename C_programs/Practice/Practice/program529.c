#include<stdio.h>

typedef unsigned long int ULONG;
int Factorial(int iNo)
{
   ULONG iMulti = 1;
   
    while( iNo != 0 )
    {
        iMulti = iMulti * iNo;
        iNo--;
    }
    return iMulti;
}
int main()
{
    int iValue = 0;
    ULONG iRet = 0;


    printf("Enter the Value : \n");
    scanf("%d",&iValue);


    iRet = Factorial(iValue);
    printf("Factorial is : %lu\n",iRet);

    return 0;
}
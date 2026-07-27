#include<stdio.h>

int Factorial(int iNo)
{
    int iMulti = 1;
   
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
    int iRet = 0;


    printf("Enter the Value : \n");
    scanf("%d",&iValue);


    iRet = Factorial(iValue);
    printf("Factorial is : %d\n",iRet);

    return 0;
}
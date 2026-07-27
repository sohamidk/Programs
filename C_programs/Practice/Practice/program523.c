#include<stdio.h>

int Summation(int iNo)
{
    static int i = 0;
    static int iSum = 0;

   
    if( i <= iNo)
    {
        iSum = iSum + i;
        i++;
        Summation(iNo);
    }
    return iSum;
}
int main()
{
    int iValue = 0;
    int iRet = 0;


    printf("Enter the Value : \n");
    scanf("%d",&iValue);


    iRet = Summation(iValue);
    printf("Summation is : %d\n",iRet);

    return 0;
}
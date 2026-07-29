#include<stdio.h>

typedef unsigned long int ULONG;
void Display(int iNo)
{
   int iDigit = 0;

   while(iNo != 0)
   {
        iDigit = iNo % 10;
        printf("%d\n",iDigit);
        iNo = iNo / 10;
   }
}
int main()
{
    int iValue = 0;
  

    printf("Enter the Value : \n");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}
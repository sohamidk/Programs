#include<stdio.h>

typedef unsigned long int ULONG;
void Display(int iNo)
{
   static int iDigit = 0;

   if(iNo != 0)
   {
        iDigit = iNo % 10;
        printf("%d\n",iDigit);
        iNo = iNo / 10;
        Display(iNo);
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
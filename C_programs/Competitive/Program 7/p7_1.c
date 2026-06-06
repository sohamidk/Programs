#include<stdio.h>

void Display(int iNo)
{
    
    for(int iCnt = 0; iCnt < 2*iNo; iCnt++)
    { 
       if(iCnt <= iNo)
       {
        printf("*");
       }
       else
       {
        printf("#");
       }
       
    } 
}

int main()
{
    int iValue = 0;

    printf("Enter a number : ");
    scanf("%d", &iValue);

    Display(iValue);
}
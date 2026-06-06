#include<stdio.h>

void Display(int iNo)
{
    
    for(int iCnt = -iNo; iCnt <= iNo; iCnt++)
    { 
        printf("%d\t", iCnt);
    } 
}

int main()
{
    int iValue = 0;

    printf("Enter a number : ");
    scanf("%d", &iValue);

    Display(iValue);
}
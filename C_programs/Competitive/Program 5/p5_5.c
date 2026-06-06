#include<stdio.h>

void MultipleDisplay(int iNo)
{
    
    for(int iCnt = 1; iCnt <=5; iCnt++)
    { 
        printf("%d\t", iCnt*iNo);
    } 
}

int main()
{
    int iValue = 0;

    printf("Enter a number : ");
    scanf("%d", &iValue);

    MultipleDisplay(iValue);
}
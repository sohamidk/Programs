#include<stdio.h>

void Pattern(int iNo)
{
    
    for(int iCnt = 0; iCnt < 2*iNo; iCnt++)
    { 
        if(iCnt % 2 == 0){
            printf("$\t");
        }
        else if(iCnt != 0){
            printf("*\t");
        }
    } 
}

int main()
{
    int iValue = 0;

    printf("Enter a number : ");
    scanf("%d", &iValue);

    Pattern(iValue);
}
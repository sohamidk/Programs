#include<stdio.h>
int Display(int iNo)
{
    int iCnt = 0;
    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("Jay Ganesh...\n");
    }
}

int main()
{
    int iValue = 0;

    printf("Enter a Frequency : ");
    scanf("%d", &iValue);
    Display(iValue);
    return 0;
}
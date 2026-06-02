#include<stdio.h>
void Table(int iNo)
{
    int iCnt = 0;
    int iMulti = 1;
    for(iCnt = 1; iCnt <= 10; iCnt++)
    {
        iMulti = iCnt * iNo;
        printf("%d\t",iMulti);
    }
}
int main()
{   
    int iValue = 0;
   

    printf("Enter a number : ");
    scanf("%d",&iValue);

    Table(iValue);
  
    return 0;
}
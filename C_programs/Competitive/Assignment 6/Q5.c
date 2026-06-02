#include<stdio.h>
void TableRev(int iNo)
{
    int iCnt = 0;
    int iMulti = 1;
    for(iCnt = 10; iCnt >= 1; iCnt--)
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

    TableRev(iValue);
  
    return 0;
}
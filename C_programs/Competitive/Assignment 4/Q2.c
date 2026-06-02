#include<stdio.h>

void FactRev(int iNo){
    int iCnt = 0;
    if(iNo <= 0){
        iNo = -iNo;
    }
    for(int iCnt = iNo; iCnt > 1; iCnt--){
        if(iNo % iCnt == 0){
            printf("%d\t", iCnt);
        }
    }
}

int main()
{
    int iValue = 0;
    

    printf("Enter a Number : ");
    scanf("%d", &iValue);

    FactRev(iValue);
    return 0;

}
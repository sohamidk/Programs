#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL CheckEven(int iNo){
    if(iNo % 2 == 0){
        printf("Number is even");
    }else{
        printf("Number is odd");
    }
}

int main(){
    int iValue = 0;
    BOOL bRet  = FALSE;
    printf("Emter a number : ");
    scanf("%d", &iValue);

    bRet = CheckEven(iValue);

    return 0;
}
#include<stdio.h>
void Display(int iNo){
    int iCnt = 0;
    for(int iCnt= 0; iCnt > iNo;iCnt++){
        printf("%d", iCnt);
    }



}
int main(){

    int iValue = 0;
    printf("Enter Number");
    scanf("%d", &iValue);

    Display(iValue);
    return 0;
}
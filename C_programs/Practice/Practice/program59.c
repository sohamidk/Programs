//input 5
//output 54321
#include<stdio.h>
void Display(int iNo){
    int iCnt = 0;
    for(int iCnt= iNo; iCnt>=1; iCnt--){
        printf("%d", iCnt);
    }
    printf("/n");



}
int main(){

    int iValue = 0;
    printf("Enter Number : ");
    scanf("%d", &iValue);

    Display(iValue);
    return 0;
}
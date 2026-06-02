//input 5
//output 543210
#include<stdio.h>
void Display(int iNo){
    int iCnt = 0;
    for(int iCnt= iNo; iCnt>=0; iCnt--){
        printf("%d\t", iCnt);
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
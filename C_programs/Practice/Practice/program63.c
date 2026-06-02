//input 5
//output -5 -4 -3 -2 -1
#include<stdio.h>
void Display(int iNo){
    int iCnt = 0;
    for(int iCnt= -iNo; iCnt<0; iCnt+=2){
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
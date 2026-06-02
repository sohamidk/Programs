//input : 5
//output : 1234
#include<stdio.h>
void Display(int iNo){
    int iCnt = 0;
    for(int iCnt= 1; iCnt<iNo; iCnt = iCnt + 2){
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
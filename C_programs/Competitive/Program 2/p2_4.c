#include<stdio.h>

void Display(int iNo, int iFrequency){
    
    for(int i = 0; i <= iNo; i++){
        printf("%d ", iNo);
    }

}

int main(){
    int iValue = 0;
    int iCount = 0;

    printf("Enter Number : ");
    scanf("%d", &iValue);

    printf("Enter Number : ");
    scanf("%d", &iCount);

    Display(iValue, iCount);
    return 0;
}
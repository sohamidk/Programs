#include<stdio.h>

void PrintEven(int iNo){
    if(iNo <= 0){
        return;
    }
    for(int i = 1; i<=iNo; i++){
        
            printf("%d\t", i*2);
        
    }
   
}

int main(){
    int iValue = 0;
    printf("Enter Number : \n");
    scanf("%d", &iValue);

    PrintEven(iValue);
    return 0;
}
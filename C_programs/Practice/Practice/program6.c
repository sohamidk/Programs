/*
    Algorithm
    
    START
        Accept first number as No1
        Accept second number as No2
        perform addition of No1 & No2
        Display result
    STOP
*/

#include<stdio.h>

int main(){
    float i = 0.0f,j = 0.0f,k = 0.0f;

    printf("Enter first number : ");
    scanf("%f", &i);

    printf("Enter Second number : ");
    scanf("%f", &j);

    k = i+j;

    printf("Addition is : %f\n", k);
    return 0;
}
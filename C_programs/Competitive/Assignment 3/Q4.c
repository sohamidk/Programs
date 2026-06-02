#include<stdio.h>

void DisplayConvert(char cValue){
    if(cValue >= 'A' && cValue <= 'Z'){
        cValue += 32;
        printf("%c", cValue);
    }
    else if(cValue >= 'z' && cValue <= 'z'){
         cValue -= 32;
         printf("%c", cValue);
    }
}

int main(){
    char CValue = '\0';
    printf("Enter a Character : \n");
    scanf("%c", &CValue);

    DisplayConvert(CValue);
     return 0;
}
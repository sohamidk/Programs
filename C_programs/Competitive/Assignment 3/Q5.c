#include<stdio.h>

typedef int BOOL;
#define TRUE 1
#define FALSE 0

BOOL CheckVowel(char cValue){
    if(cValue == 'a' || cValue == 'e' ||cValue == 'i' || 
        cValue == 'o' ||cValue == 'u'){
        return TRUE; 
    }
    else{
        return FALSE;
    }
}
int main(){
    int CValue = '\0';
    BOOL bRet  = FALSE;
    printf("Emter a number : ");
    scanf("%c",&CValue);

    bRet = CheckVowel(CValue);
    if(bRet == TRUE){
        printf("It is vowel");
    }else{
        printf("It is not vowel");
    }

    return 0;
}
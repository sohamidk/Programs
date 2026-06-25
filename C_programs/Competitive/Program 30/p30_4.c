#include<stdio.h>
#define TRUE 1
#define FALSE 0

typedef int bool;
bool ChckDigit(char ch1)
{
    if((ch1 >= 'A' && ch1 <= 'Z')||(ch1 >= 'a' && ch1 <= 'z') 
        || (ch1 >= '0' && ch1<='9'))
    {
        return FALSE;
    }
    else
    {
        return TRUE;
    }
}
int main()
{
    char cValue = '\0';
    bool bRet = FALSE;

    printf("Enter a Character : \n");
    scanf("%c", &cValue);

    bRet = ChckDigit(cValue);
    if(bRet == TRUE)
    {
        printf("It is a special symbol\n");
    }
    else
    {
        printf("It is not a special symbol\n");
    }


    return 0;
}
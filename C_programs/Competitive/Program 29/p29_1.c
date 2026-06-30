#include<stdio.h>
#define TRUE 1
#define FALSE 0

typedef int bool;
bool ChckAlpha(char ch1)
{
    if((ch1 >= 'A' && ch1 <= 'Z') || (ch1 >= 'a' && ch1 <= 'z'))
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}
int main()
{
    char cValue = '\0';
    bool bRet = FALSE;

    printf("Enter a Character : \n");
    scanf("%c", &cValue);

    bRet = ChckAlpha(cValue);
    if(bRet == TRUE)
    {
        printf("It is an Alphabet\n");
    }
    else
    {
        printf("It is not an Alphabet\n");
    }


    return 0;
}
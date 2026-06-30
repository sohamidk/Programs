#include<stdio.h>
#define TRUE 1
#define FALSE 0

typedef int bool;
bool ChckDigit(char ch1)
{
    if((ch1 >= '0' && ch1 <= '9'))
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

    bRet = ChckDigit(cValue);
    if(bRet == TRUE)
    {
        printf("It is a Digit\n");
    }
    else
    {
        printf("It is not a Digit\n");
    }


    return 0;
}
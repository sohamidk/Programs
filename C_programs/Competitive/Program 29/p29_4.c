#include<stdio.h>
#define TRUE 1
#define FALSE 0

typedef int bool;
bool ChckSmall(char ch1)
{
    if((ch1 >= 'a' && ch1 <= 'z'))
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

    bRet = ChckSmall(cValue);
    if(bRet == TRUE)
    {
        printf("It is Small Letter\n");
    }
    else
    {
        printf("It is not a Small Letter\n");
    }


    return 0;
}
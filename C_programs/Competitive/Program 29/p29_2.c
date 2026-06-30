#include<stdio.h>
#define TRUE 1
#define FALSE 0

typedef int bool;
bool ChckCapital(char ch1)
{
    if((ch1 >= 'A' && ch1 <= 'Z'))
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

    bRet = ChckCapital(cValue);
    if(bRet == TRUE)
    {
        printf("It is Capital Letter\n");
    }
    else
    {
        printf("It is not a Capital Letter\n");
    }


    return 0;
}
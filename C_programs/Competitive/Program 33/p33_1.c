#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkChar(char *str, char ch)
{
    int i = 0;
    BOOL bFlag = FALSE;
    while(str[i] != '\0')
    {
       if(str[i] == ch)
       {
         bFlag = TRUE;
         break;
       }
       i++;
    }
    return bFlag;
}

int main()
{
    char arr[20] = {'\0'};
    char cValue;
    BOOL bRet = FALSE;

    printf("Enter String : ");
    scanf("%[^'\n']s",arr);

    printf("Enter Character : ");
    scanf(" %c",&cValue);

    bRet = ChkChar(arr,cValue);
    if(bRet == TRUE)
    {
        printf("Character found \n");
    }
    else
    {
        printf("Character not found \n");
    }

    return 0;
}
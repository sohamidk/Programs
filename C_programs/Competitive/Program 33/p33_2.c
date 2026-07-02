#include<stdio.h>

int CountChar(char *str, char ch)
{
    int i = 0;
    int iCount = 0;
    while(str[i] != '\0')
    {
       if(str[i] == ch)
       {
        iCount++;
       }
       i++;
    }
    return iCount;
}

int main()
{
    char arr[20] = {'\0'};
    char cValue;
    int cRet = 0;

    printf("Enter String : ");
    scanf("%[^'\n']s",arr);

    printf("Enter Character : ");
    scanf(" %c",&cValue);

    cRet = CountChar(arr,cValue);
    printf("Count of Character is : %d\n", cRet);


    return 0;
}
#include<stdio.h>
void StrCatX(char *src, char *dest)
{
    if(src == NULL || dest == NULL)
    {
        printf("Invalid String");
        return ;
    }
    while((*src != '\0'))
    {
        src++;
    }
    *src = ' ';
    src++;
    while(*dest != '\0')
    {
        *src = *dest;
        src++;
        dest++;
    }

    *dest = '\0';
    
}
int main()
{
    char arr[50] = "Marvellous InfoSysytems";
    char brr[30] = "Logic Building";

    StrCatX(arr,brr);

    printf("%s\n",arr);
    return 0;
}
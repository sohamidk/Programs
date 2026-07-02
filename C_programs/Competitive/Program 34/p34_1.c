#include<stdio.h>
void StrCpyX(char *src, char *dest)
{
    if(src == NULL || dest == NULL)
    {
        printf("Invalid String");
        return ;
    }
    while(*src != '\0')
    {
        *dest = *src;
        src++;
        dest++;
    }
    *dest = '\0';
}
int main()
{
    char arr[30] = "Marvellous Multi OS";
    char brr[30];

    StrCpyX(arr,brr);

    printf("%s\n",brr);
    return 0;
}
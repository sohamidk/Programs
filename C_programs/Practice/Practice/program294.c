#include<stdio.h>
void ReverseDisplay(char *str)
{
    char *start = NULL;

    start = str;

    while(*str != '\0')
    {
        str++;
    }
    str--;      //to remove space
    while(start <= str)
    {
        printf("%s\n", str);
        str--;
    }
    printf("\n");
}
int main()
{
    char Arr[50] = {'\0'};

    printf("Enter string : \n");
    scanf("%[^\n]s", Arr);

    ReverseDisplay(Arr);
    return 0;
}
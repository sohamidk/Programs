#include<stdio.h>
void Display(char ch)
{
    if(ch >= 'A' && ch <= 'Z')
    {
        ch = ((char)(ch+32));
        printf("%c\n",ch);
    }
    else if(ch >= 'a' && ch <= 'z')
    {
        ch = ((char)(ch-32));
        printf("%c\n",ch);
    }
    else if(ch >='0' && ch <= '9')
    {
        printf("%c\n", ch);
    }
    else
    {
        printf("%c\n", ch);
    }
}
int main()
{
    char cValue = '\0';

    printf("Enter a character : \n");
    scanf("%c", &cValue);

    Display(cValue);
    return 0;
}
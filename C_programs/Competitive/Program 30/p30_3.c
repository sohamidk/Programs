#include<stdio.h>
void Display(char ch)
{
    if(ch >= 'A' && ch <= 'Z')
    {
        int i = 0;
        for(i = ch; i<= 'Z'; i++)
        {
            printf("%c\t",i);
        }
        
    }
    else if(ch >= 'a' && ch <= 'z')
    {
        int i = 0;
        for(i = ch; i>= 'a'; i--)
        {
            printf("%c\t",i);
        }
        printf("\n");
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
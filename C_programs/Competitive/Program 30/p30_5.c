#include<stdio.h>
void Display(char ch)
{
    printf("Decimal ASCII Value : %d\n", ch);
    printf("Octal ASCII Value : %o\n", ch); 
    printf("HexaDecimal ASCII Value : %X\n", ch);

}
int main()
{
    char cValue = '\0';

    printf("Enter a character : \n");
    scanf("%c", &cValue);

    Display(cValue);
    return 0;
}
#include<stdio.h>
void DisplayASCII()
{
    int ch = 0;
    while(ch <= 255)
    {
        printf("%c\t",ch);
        ch++;
    }
    printf("\n");
}
int main()
{
    DisplayASCII();
    return 0;
}
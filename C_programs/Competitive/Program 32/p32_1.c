#include<stdio.h>
void strlwrx(char *str)
{
    int i = 0;
    while(str[i] != '\0')
    {
      if(str[i] >= 'A' && str[i] <= 'Z')
      {
        str[i] = (char)(str[i] + 32);
      }
      i++;
    }
}
int main()
{
    char Arr[20] = {'\0'};

    printf("Enter a String : ");
    scanf("%[^'\n']s", Arr);

    strlwrx(Arr);

    printf("Modified String is : %s\n", Arr);
    return 0;
}
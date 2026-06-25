#include<stdio.h>
void struprx(char *str)
{
    int i = 0;
    while(str[i] != '\0')
    {
      if(str[i] >= 'a' && str[i] <= 'z')
      {
        str[i] = (char)(str[i] - 32);
      }
      i++;
    }
}
int main()
{
    char Arr[20] = {'\0'};

    printf("Enter a String : ");
    scanf("%[^'\n']s", Arr);

    struprx(Arr);

    printf("Modified String is : %s\n", Arr);
    return 0;
}
#include<stdio.h>

void StrRevX(char *str)
{
   char *start = NULL;
   char *end = NULL;
   char temp = '\0';

   start = str;

   while(str != '\0')
   {
    str++;
   }
   str--;
   end = str;

   while(start <= end)
   {
    temp = *start;
    *start = *end;
    *end = temp;

    start++;
    end--;
   }

}

int main()
{
    char arr[20] = {'\0'};

    printf("Enter String : ");
    scanf("%[^'\n']s",arr);

    StrRevX(arr);

    printf("Updated string : %s\n", arr);

    return 0;
}
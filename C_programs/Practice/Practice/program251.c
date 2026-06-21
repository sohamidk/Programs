#include<stdio.h>

int Count(const char *str)
{
    int iCount = 0;
   while(*str != '\0')
   {
    if(*str == 'a' || *str == 'A')
    {
        iCount++;
    }
    str++;
   }
   return iCount;

}
int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0;

    printf("Enter string : ");
    scanf("%[^'\n']s",Arr);       
            
    iRet = Count(Arr);
    printf("Length of string is : %d\n", iRet);


    return 0;
}
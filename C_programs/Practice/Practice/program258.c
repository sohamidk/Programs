#include<stdio.h>

void update(char *str)
{
    int iCount = 0;
   while(*str != '\0')
   {
    if(*str == 'l')
    {
        *str = '-' ;
    }
    str++;  
   }
   

}
int main()
{
    char Arr[50] = {'\0'};
    

    printf("Enter string : ");
    scanf("%[^'\n']s",Arr);       
            
    update(Arr);
    printf("Updated string is : %s\n", Arr);


    return 0;
}
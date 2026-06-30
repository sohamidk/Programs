#include<stdio.h>
void DisplaySchedule(char ch)
{
    if(ch == 'A')
    {
        printf("Your Exam at 7 AM \n");
    }
    else if(ch == 'B')
    {
         printf("Your Exam at 8.30 AM \n");
    } else if(ch == 'C')
    {
         printf("Your Exam at 9.20 AM \n");
    }
     else if(ch == 'D')
    {
         printf("Your Exam at 10.30 AM \n");
    }
    else
    {
        printf("Division does not exist\n");
    }

}
int main()
{
    char cValue = '\0';
    
    printf("Enter the Division : \n");
    scanf("%c", &cValue);

    DisplaySchedule(cValue);

    return 0;
}
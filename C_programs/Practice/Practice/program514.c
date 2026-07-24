#include<stdio.h>

void Display(int iNo)
{
   static int i = 1;

   if(i <= iNo)
   {
        printf("Jay Ganesh...\n");
        i++;
        Display(iNo);
   }

}
int main()
{
    int iValue = 0;

    printf("Enter the frequency : \n");
    scanf("%d",&iValue);
    
    Display(iValue);

    printf("End of main\n");

    return 0;
}
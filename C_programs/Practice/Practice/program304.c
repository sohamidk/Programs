#include<stdio.h>

int main()
{
   int No1 = 0, No2 = 0, Ans = 0;

   printf("Enter first No : ");
   scanf("%d",&No1);
    
   printf("Enter Second No : ");
   scanf("%d",&No2);

   Ans = No1 & No2;
 
   printf("AND : %d\n", Ans);
  
    return 0;
}
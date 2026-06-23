#include<stdio.h>
#include<string.h>
int main()
{
    struct Student
    {
    int RollNo;             //Member
    char Name[20];          //Member
    float marks;            //Member
    };
    
   struct Student sobj = {11, "Soham", 89.5};       //Member initialization method 2
    
    printf("%s\n",sobj.Name);
    printf("%d\n",sobj.RollNo);
    printf("%f\n",sobj.marks);
    return 0;
}
#include<stdio.h>
#include<string.h>
int main()
{
    struct Student
    {
    int RollNo;             //Member
    char Name[20];          //Member
    float marks;              //Member
    };
    
    struct Student sobj;        //Object of structure
    
    sobj.RollNo = 11;               //Member initialization
    strcpy(sobj.Name, "Soham");     //Member initialization         method 1
    sobj.marks = 89.5;                //Member initialization
    
    
    printf("%s\n",sobj.Name);
    printf("%d\n",sobj.RollNo);
    printf("%f\n",sobj.marks);
    return 0;
}
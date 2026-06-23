#include<stdio.h>

struct UsingPointer
{
    int RollNo;
    float marks;
};

int main()
{
    struct UsingPointer *ptr = NULL; //Accessing through pointer Object using '->' operator 
    (*ptr).marks = 89.5;
    (*ptr).RollNo = 11;

   

    printf("%d\n",ptr->RollNo);
    printf("%f\n", ptr->marks);

    /*
        Equivalent to
        printf("%d\n",(*ptr).RollNo);
        printf("%f\n",(*ptr).marks);
    */
}
#include<stdio.h>
#include<stdlib.h>

struct Student
{
    int RollNo;
    float Marks;
};

int main()
{
    struct Student *ptr = NULL;
    ptr = (struct Student *)malloc(sizeof(struct Student));

    printf("Enter Roll Number : ");
    scanf("%d", &ptr->RollNo);

    printf("Enter Marks : ");
    scanf("%f", &ptr->Marks);


    printf("Roll No : %d\n",ptr->RollNo);
    printf("Marks is : %f\n", ptr->Marks);

    free(ptr);
    return 0;
}
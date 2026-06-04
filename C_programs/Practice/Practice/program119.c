#include<stdio.h>
//Error due to stdlib.h
int main()
{
    int *Brr = NULL;
    int iLength = 0, iCnt = 0;

    //Accept number of elements
    printf("Enter number of element : \n");
    scanf("%d",&iLength);

    //Step 2 : Allocate the memory
    Brr = (int *)malloc(iLength * sizeof(int));

    //Step 3 : Accept the input from user
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d", &Brr[iCnt]);
    } 

    //Step 4 : Use the memory (LOGIC)


    //Step 5 : Deallocate the memory
    free(Brr);
    return 0;
}
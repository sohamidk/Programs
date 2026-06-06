#include<stdio.h>
#include<stdlib.h>
void Display(int Arr[], int iSize)
{
    int iCnt = 0;
    for(iCnt = 0; iCnt<iSize; iCnt++)
    {
        if(Arr[iCnt] % 3 == 0 && Arr[iCnt] % 5 == 0)
        {
            printf("%d\t", Arr[iCnt]);
        }
    }
}
int main()
{
    int iValue = 0, iLength = 0, iCnt = 0;
    int *brr = NULL;

    printf("Enter numbers of elements : ");
    scanf("%d", &iLength);

    brr = (int *)malloc(iLength * sizeof(int));
    if(brr == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d", &brr[iCnt]);
    }

     Display(brr, iLength);
     free(brr);
    return 0;
}
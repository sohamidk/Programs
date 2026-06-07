#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>

void Range(int Arr[], int iSize, int iStart, int iEnd)
{
    int iCnt = 0;
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] > iStart && Arr[iCnt] < iEnd)
        {
            printf("%d\t",Arr[iCnt]);
        }
    }
}
int main()
{
    int iLength = 0, iCnt = 0, iValue1 = 0, iValue2 = 0;
    int iRet = 0;
    int *Brr = NULL;

    printf("Enter number of elements : ");
    scanf("%d", &iLength);

   
    Brr = (int *)malloc(sizeof(int) * iLength);

    if(Brr == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }
 
    printf("Enter range to start : \n");
    scanf("%d", &iValue1);

    printf("Enter range to end : \n");
    scanf("%d", &iValue2);

    printf("Enter elements of array : \n");
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
    scanf("%d",&Brr[iCnt]);
    }

   

    Range(Brr, iLength, iValue1, iValue2);
    free(Brr);
    return 0;
}
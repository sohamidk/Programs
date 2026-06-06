#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL Check(int Arr[],int iSize)
{
    int iCnt = 0;
    int iCount = 0;
    for(iCnt = 0; iCnt<iSize; iCnt++)
    {
        if(Arr[iCnt] == 11)
        {
            iCount++;
        }
    }
    return iCount;
}

int main()
{
    int bRet = 0, iCnt = 0, iLength = 0;
    int *brr = NULL;

    printf("Enter numbers of element : ");
    scanf("%d", &iLength);

    brr = (int *)malloc(iLength * sizeof(int));

    if(brr == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Elements of array are : \n");
    for(iCnt = 0; iCnt< iLength; iCnt++)
    {
        scanf("%d",&brr[iCnt]);
    }

        bRet = Check(brr, iLength);
    if(bRet == TRUE)
    {
        printf(" 11 is present");
    }
    else
    {
        printf(" 11 is not present");
    }
    free(brr);
    return 0;
}
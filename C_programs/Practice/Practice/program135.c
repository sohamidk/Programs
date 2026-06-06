#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool LinearSearch(int Arr[], int iSize, int iNo)
{
    int iCnt = 0;
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            break;
        }
    }
    if(iCnt < iSize)
    {
        return true;
    }
    else
    {
        return false;
    }

}

int main()
{
    int iLength = 0, iCnt = 0, iValue = 0;
    bool bRet = false;
    int *brr = NULL;

    printf("Enter number of elements : ");
    scanf("%d", &iLength);

    brr = (int *)malloc(iLength * sizeof(int));
    if(brr == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter the elements : \n");
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d", &brr[iCnt]);
    }

    printf("Enter element to search : \n");
    scanf("%d", &iValue);

    bRet = LinearSearch(brr, iLength, iValue);
    if(bRet == true)
    {
        printf("Element is present \n");
    }
    else
    {
        printf("Element is not present \n");
    }

    free(brr);
    return 0;
}
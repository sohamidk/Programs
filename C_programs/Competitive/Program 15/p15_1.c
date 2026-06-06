#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>
bool Check(int Arr[], int iSize, int iNo)
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
    int *Brr = NULL;

    printf("Enter number of elements : ");
    scanf("%d", &iLength);

    Brr = (int *)malloc(sizeof(int) * iLength);

    printf("Enter elements of array : \n");
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
    scanf("%d",&Brr[iCnt]);
    }

    printf("Enter element to search : \n");
    scanf("%d", &iValue);
    bRet = Check(Brr, iLength, iValue);
    if(bRet == true)
    {
        printf("Element is present \n");
    }
    else
    {
        printf("Element is not present \n");
    }

    free(Brr);
    return 0;
}
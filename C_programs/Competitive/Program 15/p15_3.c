#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>

int FirstOcc(int Arr[], int iSize, int iNo)
{
    int iCnt = 0;
    int iPos = -1;
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            iPos = iCnt;
        }
    }
    return iPos;
}
int main()
{
    int iLength = 0, iCnt = 0, iValue = 0;
    int iRet = 0;
    int *Brr = NULL;

    printf("Enter number of elements : ");
    scanf("%d", &iLength);

    printf("Enter element : \n");
    scanf("%d", &iValue);

    Brr = (int *)malloc(sizeof(int) * iLength);

    if(Brr == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter elements of array : \n");
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
    scanf("%d",&Brr[iCnt]);
    }

    

    iRet = FirstOcc(Brr, iLength, iValue);
    if(iRet == -1)
    {
        printf("There is no such element\n");
    }
    else
    {
        printf("Last occurance of element at : %d \n",iRet);
    }

    free(Brr);
    return 0;
}
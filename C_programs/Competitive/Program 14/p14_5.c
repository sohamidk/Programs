#include<stdio.h>
#include<stdlib.h>
int Frequency(int Arr[], int iSize, int iNo)
{
    int iCnt = 0;
    int iCount = 0;
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
           iCount++;
        }
    }
    return iCount;
}
int main()
{
    int iLength = 0, iRet = 0, iValue = 0, iCnt = 0;
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
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d", &brr[iCnt]);
    }

    printf("Enter number : ");
    scanf("%d", &iValue);

    iRet = Frequency(brr,iLength, iValue);
    printf("Count is : %d\n",iRet);

    free(brr);
    return 0;
}
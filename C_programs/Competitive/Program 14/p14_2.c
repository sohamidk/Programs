#include<stdio.h>
#include<stdlib.h>
int Frequency(int Arr[], int iSize)
{
    int iCnt = 0;
    int iEvenCount = 0, iOddCount = 0;
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] % 2 == 0)
        {
           iEvenCount++;
        }
        else if(Arr[iCnt] != 0)
        {
            iOddCount++;
        }
    }
    return (iEvenCount - iOddCount);
   
}
int main()
{
    int iLength = 0, iRet = 0,  iCnt = 0;
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

    iRet = Frequency(brr, iLength);
    printf("Count of even number is : %d\n",iRet);

    free(brr);
    return 0;
}
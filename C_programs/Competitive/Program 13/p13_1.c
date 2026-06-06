#include<stdio.h>
#include<stdlib.h>
int Diffrence(int Arr[], int iSize)
{
    int iCnt = 0, iDiff = 0;
    int iSumEven = 0;
    int iSumOdd = 0;
    printf("Elements of array are : \n");

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {   
        if(Arr[iCnt] % 2 == 0)
        {
            iSumEven = iSumEven + Arr[iCnt];
        }
        else if(Arr[iCnt] % 2 != 0)
        {
            iSumOdd = iSumOdd + Arr[iCnt];
        }
    }
        iDiff = iSumEven - iSumOdd;
        return iDiff;

}
int main()
{
    int iLength = 0, iRet = 0,iCnt = 0;
    int *brr = NULL;
    printf("Enter Number of Elements : ");
    scanf("%d",&iLength);

    brr = (int *)malloc(iLength* sizeof(int));

    if(brr == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d", &brr[iCnt]);
    }

    iRet = Diffrence(brr, iLength);
    printf("Result is : %d", iRet);
    free(brr);
    return 0;
}
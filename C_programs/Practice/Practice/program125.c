#include<stdio.h>
#include<stdlib.h>
int SumEven(int Arr[], int iSize)
{
    int iCnt = 0;
    int iSum = 0;
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] % 2 == 0)
        {
          iSum = iSum + Arr[iCnt];
        }
    }
    return iSum;

}
int main()
{
    int iLength = 0, iCnt = 0, iRet = 0;
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

    iRet = SumEven(brr, iLength);
    printf("Summation of Even number is : %d\n", iRet);

    free(brr);
    return 0;
}
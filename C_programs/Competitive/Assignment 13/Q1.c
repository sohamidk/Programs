#include<stdio.h>
int Diffrence(int Arr[], int iLength)
{
    
}
int main()
{
    int iSize = 0, iRet = 0,iCnt = 0;
    int *brr = NULL;
    printf("Enter Number of Elements : ");
    scanf("%d",&iSize);

    brr = (int *)malloc(iSize * sizeof(int));

    if(brr == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter %d elements",iLength);
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        printf("Enter elements : %d", iCnt+1);
        scanf("%d", &brr[iCnt]);
    }

    iRet = Diffrence(brr, iSize);
    printf("Result is : %d", iRet);
    return 0;
}
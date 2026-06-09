#include<stdio.h>
void update(int Arr[], int iSize)
{
    int iCnt = 0;
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        Arr[iCnt]++;
    }

}
int main()
{
    int iCnt = 0;
    int Brr[] = {10, 20, 30, 40, 50};
    printf("Array Elements Before function call : \n");
    for(iCnt = 0; iCnt < 5; iCnt++)
    {
        printf("%d\n",Brr[iCnt]);
    }
    update(Brr, 5);

    printf("Array Elements After function call : \n");
    for(iCnt = 0; iCnt < 5; iCnt++)
    {
        printf("%d\n",Brr[iCnt]);
    }
    return 0;
}
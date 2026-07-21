#include<iostream>
using namespace std;

template <class T>
int SearchLast(T *arr, int iSize, T iNo)
{
    int i = 0;
    int iCount = 0;
    for(i = 0; i < iSize; i++)
    {
        if(arr[i] == iNo)
        {
            iCount = i;
        }
    }
    return iCount;
}
int main()
{
    int Arr[] = {10,20,30,10,20,30,40,10,40};
    int iRet = SearchLast(Arr,9,10);
    printf("%d\n",iRet);

    return 0;
}
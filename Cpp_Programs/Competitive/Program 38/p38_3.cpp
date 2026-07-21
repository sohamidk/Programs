#include<iostream>
using namespace std;

template <class T>
int SearchFirst(T *arr, int iSize, T iNo)
{
    int i = 0;
    for(i = 0; i < iSize; i++)
    {
        if(arr[i] == iNo)
        {
            break;
        }
    }
    return i;
}
int main()
{
    int Arr[] = {10,20,30,10,20,30,40,10,40};
    int iRet = SearchFirst(Arr,9,40);
    printf("%d\n",iRet);

    return 0;
}
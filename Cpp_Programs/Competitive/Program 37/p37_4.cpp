#include<iostream>
using namespace std;

template <class T>

T Max(T *arr, int iSize)
{
    int i = 0;
    T Max = 0;
    for(i = 0; i < iSize; i++)
    {
        if(arr[i] > Max)
        {
            Max = arr[i];
        }
    }
   
    return Max;
}

int main()
{
    int Arr[] = {10,20,30,40,50};
    float Brr[] = {10.0,3.7,9.8,8.7};

    int iRet = Max(Arr,5);
    printf("%d\n",iRet);

    float fRet = Max(Brr,4);
    printf("%f\n",fRet);

    return 0;
}
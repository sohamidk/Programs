#include<iostream>
using namespace std;

template <class T>

T AddN(T *arr, int iSize)
{
    int i = 0;
    T iSum = 0;
    for(i = 0; i < iSize; i++)
    {
        iSum = iSum + arr[i];
    }
    return iSum;
}

int main()
{
    int Arr[] = {10,20,30,40,50};
    float Brr[] = {10.0,3.7,9.8,8.7};

    int iSum = AddN(Arr,5);
    printf("%d\n",iSum);

    float fSum = AddN(Brr,4);
    printf("%f\n",fSum);
    return 0;
}
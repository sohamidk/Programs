#include<iostream>
using namespace std;

template <class T>
void Reverse(T *arr, int iSize)
{
    int i = 0;
    for(i = iSize - 1; i >= 0; i--)
    {
        cout<<arr[i]<<"\t";
    }
    cout<<endl;
}
int main()
{
    int Arr[] = {10,20,30,10,20,30,40,10,40};

    int i = 0;
    for(i = 0; i < 9; i++)
    {
        cout<<Arr[i]<<"\t";
    }
    cout<<endl;

    Reverse(Arr,9);
   
    return 0;
}
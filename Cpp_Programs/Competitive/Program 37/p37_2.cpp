#include<iostream>
using namespace std;

template <class T>

T Max(T No1, T No2, T No3)
{
    if(No1 > No2 && No1 > No3)
    {
        return No1;
    }
    else if(No2 > No1 && No2 > No3)
    {
        return No2;
    }
    else
    {
        return No3;
    }
}
int main()
{
    cout<<Max(10,5,6)<<endl;
    cout<<Max(11.3f,23.5f,12.5f)<<endl;
    cout<<Max(11.3,12.5,22.5)<<endl;

    return 0;
}
#include<iostream>
using namespace std;

template <class T>

void Display(T value, int iSize)
{
    int i = 0;
    for(i = 0; i < iSize; i++)
    {
        cout<<value<<"\t";
    }
    cout<<endl;
}
int main()
{
    Display('M',7);
    Display(11,3);
    Display(2.6, 4);

    return 0;
}
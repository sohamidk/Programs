#include<iostream>
using namespace std;

void Display(int iNo)
{
    
    if(iNo == 0)
    {
       return;
    }
    cout<<"*\t";
    Display(iNo - 1);
}

int main()
{
    Display(5);

    return 0;
}
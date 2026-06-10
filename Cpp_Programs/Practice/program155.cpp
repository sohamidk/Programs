#include<iostream>
using namespace std;

#pragma pack(1)

class ArrayX
{
    public:
        int *Arr;
        int iSize;

        ArrayX(int X)           //parametrized constructor
        {
                            
        }
    
};

int main()
{
    ArrayX aobj;              //Error : this object must require default constructor
    cout<<sizeof(aobj)<<endl;
    return 0;
}
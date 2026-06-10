#include<iostream>
using namespace std;

#pragma pack(1)

class ArrayX
{
    public:
        int *Arr;
        int iSize;

         ArrayX()           //Default constructor
        {
                            
        }

        ArrayX(int X)      //parametrized constructor
        {
                            
        }
    
};

int main()
{
    ArrayX aobj(5);             
    cout<<sizeof(aobj)<<endl;
    return 0;
}
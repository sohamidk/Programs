#include<iostream>
using namespace std;

#pragma pack(1)
class ArrayX
{
    public:
        int *Arr;
        int iSize;

        //Parameterized constructor
        ArrayX(int X)
        { 
            cout<<"Inside constructor"<<endl;
            int iSize = X;                         //Characteristics initialization
            Arr = new int[iSize];                  //Resource allocation
        }

        ~ArrayX()                                  //Destructor
        {
            cout<<"Inside destructor"<<endl;
            delete []Arr;                         //Resource deallocation
        }


};
int main()
{
    //Static memory allocation for object
    //ArrayX aobj(5);

    ArrayX *aobj = new ArrayX(5);
    delete aobj;

    cout<<"End of main"<<endl;
    return 0;
}
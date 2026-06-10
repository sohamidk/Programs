#include<iostream>
using namespace std;
class ArrayX
{
    public:
        int *Arr;
        int iSize;

        //Parameterized constructor
        ArrayX(int X)
        {
            int iSize = X;                         //Characteristics initialization
            cout<<"Inside constructor"<<endl;
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

    return 0;
}
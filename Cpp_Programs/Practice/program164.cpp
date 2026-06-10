#include<iostream>
using namespace std;

#pragma pack(1)
class ArrayX
{
    private:
        int *Arr;
        int iSize;

        public:
        //parameterize constructor
        ArrayX(int X)
        {
            iSize = X;               //Characteristics initialization
            Arr = new int[iSize];    //resource allocation
        }

        ~ArrayX()                    // destructor
        {
            delete []Arr;            //resource deallocation
        }
};

int main()
{
   // static memory allocation for object
   // ArrayX aobj1(5);     

    ArrayX *aobj1 = new ArrayX(5);

    // Logic (Function call)
    cout<<aobj1->iSize<<"\n";       //Error due to access specifier
    aobj1->Arr = NULL;              //Error due to access specifier
    delete aobj1;
    return 0;
}
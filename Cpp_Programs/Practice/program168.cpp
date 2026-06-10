#include<iostream>
using namespace std;

#pragma pack(1)

class ArrayX
{
    private:
            int *Arr;
            int iSize;
    public:
            ArrayX(int X = 5)
            {
                iSize = X;
                Arr = new int[iSize];
            }

            void Accept()
            {
                int iCnt = 0;
                cout<<"Enter the elements : "<<endl;
                for(iCnt = 0; iCnt < iSize; iCnt++)
                {
                    cin>>Arr[iCnt];
                }
            }
              void Display()
            {
                int iCnt = 0;
                cout<<"Elements of array are : "<<endl;
                for(iCnt = 0; iCnt < iSize; iCnt++)
                {
                    cout<<Arr[iCnt];
                }
            }

};

int main()
{
    ArrayX *aobj = NULL;
    int iLength = 0;

    cout<<"Enter number of elements : ";
    cin>>iLength;

    aobj = new ArrayX(iLength);

    aobj->Accept();
    aobj->Display();

    delete aobj;

    return 0;
}
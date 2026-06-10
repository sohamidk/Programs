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
            int Summation()
            {
                int iCnt = 0, iSum = 0;
                for(iCnt = 0; iCnt < iSize; iCnt++)
                {
                    iSum = iSum + Arr[iCnt];
                }
                return iSum;
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
    int iLength = 0, iRet = 0;

    cout<<"Enter number of elements : ";
    cin>>iLength;

    aobj = new ArrayX(iLength);

    aobj->Accept();
    aobj->Display();

    iRet = aobj->Summation();
    cout<<"Summation is : "<<iRet<<endl;
    delete aobj;

    return 0;
}
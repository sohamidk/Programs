#include<iostream>
using namespace std;
class ArrayX
{
    public:
    int Summation(int Arr[], int iSize)
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return iSum;
    }
};

int main()
{
    int *Brr = NULL;
    int iCnt = 0, iRet = 0, iLength = 0;
    ArrayX aobj;

    cout<<"Enter number of elements : ";
    cin>>iLength;

    Brr = new int[iLength];

    cout<<"Enter elements of array : "<<endl;
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        cin>>Brr[iCnt];
    }

    cout<<"Elements of array : "<<endl;
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        cout<<Brr[iCnt]<<endl;
    }

    iRet = aobj.Summation(Brr, iLength);   //Error due to private access specifier

    return 0;
}
#include<iostream>
using namespace std;
class ArrayX
{

};

int main()
{
    int *Brr = NULL;
    int iLength = 0, iRet = 0, iCnt = 0;
    ArrayX aobj;

    cout<<"Enter number of elements : "<<endl;
    cin>>iLength;
    
    Brr = new int(iLength);
    
    return 0;
}
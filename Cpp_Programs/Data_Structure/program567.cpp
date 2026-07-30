#include<iostream>
using namespace std;

class Searching
{
    private :
        int *Arr;
        int iSize;

    public :
        Searching(int iNo);
       ~Searching();

        void Accept();
        void Display();

        bool LinearSearch(int iNo);
};

Searching :: Searching(int iNo)
{
    iSize = iNo;
    Arr = new int[iSize];
}

Searching :: ~Searching()
{
    delete []Arr;
}

void Searching :: Accept()
{
    cout<<"Enter the Elements : "<<endl;
    int i = 0;

    for(i = 0; i < iSize; i++)
    {
        cin>>Arr[i];
    }
    printf("\n");
}

void Searching :: Display()
{
    cout<<"Elelemts of the array are : "<<endl;
    int i = 0;

    for(i = 0; i < iSize; i++)
    {
        cout<<Arr[i]<<"\n";
    }
}

bool Searching :: LinearSearch(int iNo)
{
    bool bFlag = false;

    int i = 0;
    for(i = 0; i < iSize; i++)
    {
        if(Arr[i] == iNo)
        {
            bFlag = true;
            break;
        }
    }
    return bFlag;

}


int main()
{
    Searching sobj(5);

    sobj.Accept();
    sobj.Display();

    if(sobj.LinearSearch(50) == true)
    {
        printf("Element is found \n");
    }
    else
    {
        printf("Element is not found \n");
    }

    return 0;
}
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
int main()
{
    Searching sobj(5);

    sobj.Accept();
    sobj.Display();
    return 0;
}
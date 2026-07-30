//SinglyCL Generic Code
#include<iostream>
using namespace std;

#pragma pack(1)

template <class T>
struct node
{
    T data;
    struct node<T> * next;
};


template <class T>
class SinglyCL
{
    private:
        struct node<T>  * first;
        struct node <T> * last;
        int iCount;
    
    public :
        SinglyCL();

        void Display();
        int Count();

        void InsertFirst(int iNo);
        void InsertLast(int iNo);
        void InsertAtPos(int iNo, int iPos);

        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int iPos);

};

template <class T>
SinglyCL<T> :: SinglyCL()
{
    this->first = NULL;
    this->last = NULL;
    this->iCount = 0;

}

template <class T>
void SinglyCL<T> :: Display()
{
    struct node *temp = first;
    if(first == NULL && last == NULL)
    {
        return;
    }

    do
    {
        cout<<"| "<<temp->data<<" | -> ";
        temp = temp -> next;
    } while (temp != last->next);

    cout<<endl;
}

template <class T>
int SinglyCL<T> :: Count()
{
    return iCount;
}

template <class T>
void SinglyCL<T> :: InsertFirst(int iNo)
{
    struct node * newn = NULL;
    newn = new struct node;

    newn->data = iNo;
    newn->next = NULL;

    if(first == NULL && last == NULL)
    {
        this->first = newn;
        this->last = newn;
    }
    else
    {
        newn->next = this->first;
        this->first = newn;
    }

    last->next = this->first;
    iCount++;
}

template <class T>
void SinglyCL<T> :: InsertLast(int iNo)
{
    struct node * newn = NULL;
    newn = new struct node ;

    newn->data = iNo;
    newn->next = NULL;

    if(first == NULL && last == NULL)
    {
        this->first = newn;
        this->last = newn;
    }
    else
    {
        last->next = newn;
        last = newn;
    }
    last->next = this->first;
    iCount++;
}

template <class T>
void SinglyCL<T> :: InsertAtPos(int iNo, int iPos)
{
    int i = 0;
    struct node * temp = NULL;

    if((iPos<1) || (iPos > iCount + 1))
    {
        cout<<"Invalid Position"<<endl;
        return;
    }

    if(iPos == 1)
    {
        InsertFirst(iNo);
    }
    else if(iPos == iCount + 1)
    {
        InsertLast(iNo);
    }
    else
    {
        struct node * newn = NULL;
        newn = new struct node ;

        newn->data = iNo;
        newn->next = NULL;

        temp = first;

        for(i = 1; i < iPos - 1; i++)
        {
            temp = temp -> next;
        }
       newn->next = temp->next;
       temp->next = newn;
        
       iCount++;
    }
    

}

template <class T>
void SinglyCL<T> :: DeleteFirst()
{
    if(first == NULL && last == NULL)
    {
        return;
    }
    else if(first == last)
    {
        delete first;
        first = NULL;
        last = NULL;
    }
    else
    {
        first = first -> next;
        delete last->next;
        last->next = first;
    }
    iCount--;

}

template <class T>
void SinglyCL<T> :: DeleteLast()
{
    struct node * temp = NULL;
    if(first == NULL && last == NULL)
    {
        return;
    }
    else if(first == last)
    {
        delete first;
        first = NULL;
        last = NULL;
    }
    else
    {
        temp = first;

        while(temp->next != last)
        {
            temp = temp->next;
        }
        delete last;
        last = temp;
        temp->next = first;    
    }
    iCount--;
}

template <class T>
void SinglyCL<T> :: DeleteAtPos(int iPos)
{
    int i = 0;
    struct node * temp = NULL;
    struct node * target = NULL;
    if((iPos<1) || (iPos > iCount))
    {
        cout<<"Invalid Position"<<endl;
        return;
    }

    if(iPos == 1)
    {
        DeleteFirst();
    }
    else if(iPos == iCount)
    {
        DeleteLast();
    }
    else
    {
        temp = first;

        for(i = 1; i < iPos - 1; i++)
        {
            temp = temp -> next;
        }
        target = temp->next;
        temp->next = target->next;
        delete target;

        iCount--;
    }
   
}


int main()
{
    int iRet = 0;
    SinglyCL <int>sobj;

    sobj.InsertFirst(51);
    sobj.InsertFirst(21);
    sobj.InsertFirst(11);

    sobj.Display();

    iRet = sobj.Count();
    cout<<"Number of nodes are : "<<iRet<<endl;


    sobj.InsertLast(101);
    sobj.InsertLast(111);
    sobj.InsertLast(121);
    

    sobj.Display();

    iRet = sobj.Count();
    cout<<"Number of nodes are : "<<iRet<<endl;

    sobj.InsertAtPos(105,4);

    sobj.Display();

    iRet = sobj.Count();
    cout<<"Number of nodes are : "<<iRet<<endl;

    sobj.DeleteFirst();


    sobj.Display();

    iRet = sobj.Count();
    cout<<"Number of nodes are : "<<iRet<<endl;


    sobj.DeleteLast();


    sobj.Display();

    iRet = sobj.Count();
    cout<<"Number of nodes are : "<<iRet<<endl;


    sobj.DeleteAtPos(4);


    sobj.Display();

    iRet = sobj.Count();
    cout<<"Number of nodes are : "<<iRet<<endl;

    return 0;
}
//Doubly Circular LL
#include<iostream>
using namespace std;

template <class T>
struct node
{
    int data;
    struct node<T> * next;
    struct node<T> * prev;
};

template <class T>
class DoublyCL
{
    private :
        struct node<T> * first;
        struct node<T> * last;
        int iCount;
    
    public :
        DoublyCL();

        void Display();
        int Count();

        void InsertFirst(int iNo);
        void InsertLast(int iNo);
        void InsertAtPos(int iNo,int iPos);

        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int iPos);
};

template <class T>
DoublyCL<T> :: DoublyCL()
{
    this->first = NULL;
    this->last = NULL;
    this->iCount = 0;
}

template <class T>
void DoublyCL<T> :: Display()
{
    struct node<T> * temp = NULL;
    temp = first;
    if(first == NULL && last == NULL)
    {
        return;
    }

    do
    {
       cout<<" | "<<temp->data<<" | ";
       temp = temp->next;
    } while (temp != last->next);

    cout<<endl;
    
}

template <class T>
int DoublyCL<T> ::  Count()
{
    return iCount;
}

template <class T>
void DoublyCL<T> :: InsertFirst(int iNo)
{
    struct node<T> * newn = NULL;
    struct node<T> * temp = NULL;

    newn = new node<T>;

    newn->data = iNo;
    newn->next = NULL;
    newn->prev = NULL;

    if(first == NULL && last == NULL)
    {
        first = newn;
        last = newn;
    }
    else
    {
        newn->next = first;
        first->prev = newn;
        first = newn;
    }
    last->next = first;
    first->prev = last;


    iCount++;
}

template <class T>
void DoublyCL<T> :: InsertLast(int iNo)
{
    struct node<T> * newn = NULL;
    struct node<T> * temp = NULL;

    newn = new node<T>;

    newn->data = iNo;
    newn->next = NULL;
    newn->prev = NULL;

    if(first == NULL && last == NULL)
    {
        first = newn;
        last = newn;
    }
    else
    {
        last->next = newn;
        newn->prev = last;
        last = newn;
    }
    last->next = first;
    first->prev = last;

    iCount++;
}

template <class T>
void DoublyCL<T> :: InsertAtPos(int iNo,int iPos)
{}

template <class T>
void DoublyCL<T> :: DeleteFirst()
{

}

template <class T>
void DoublyCL<T> :: DeleteLast()
{}

template <class T>
void DoublyCL<T> :: DeleteAtPos(int iPos)
{}


int main()
{
    int iRet = 0;
    DoublyCL<int> dobj;

    dobj.InsertFirst(51);
    dobj.InsertFirst(21);
    dobj.InsertFirst(11);

    dobj.Display();
    iRet = dobj.Count();
    printf("Number of nodes are : %d\n",iRet);


    dobj.InsertLast(101);
    dobj.InsertLast(111);
    dobj.InsertLast(121);

    dobj.Display();
    iRet = dobj.Count();
    printf("Number of nodes are : %d\n",iRet);

    return 0;
}
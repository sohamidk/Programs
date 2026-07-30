#include<iostream>
using namespace std;
#pragma pack(1)
//Doubly Linear LL

template <class T>
struct node
{
    int data;
    struct node<T> *next;
    struct node<T> *prev;
};

template <class T>
class DoublyLL
{
    private :
        struct node * first;
        int iCount;
    
    public :
        DoublyLL();    
        void Display();
        int  Count();
        void InsertFirst(int iNo);
        void InsertLast(int iNo);
        void InsertAtPos(int iNo, int iPos);
        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int iPos);

};
//className
template <class T>
DoublyLL<T> :: DoublyLL()
{
    this->first = NULL;
    this->iCount = 0;
}

template <class T>
void DoublyLL<T> :: Display()
{
    struct node * temp = NULL;
    temp = this->first;

    cout<<"NULL";
    while(temp != NULL)
    {
        cout<<" <=> | "<< temp->data<<" | ";
        temp = temp->next;
    }
    cout<<" <=> NULL"<<endl;
}

template <class T>

int DoublyLL<T> :: Count()
{
    return this->iCount;
}


template <class T>
void DoublyLL<T> :: InsertFirst(int iNo)
{
     struct node * newn = NULL;

    newn = new  struct node ;
    newn->data = iNo;
    newn->next = NULL;
    newn->prev = NULL;

    if(this->first == NULL)
    {
        this->first = newn;
    }
    else
    {
        newn->next = this->first;
        this->first = newn;
    }
    this->iCount++;
}

template <class T>
void DoublyLL<T> :: InsertLast(int iNo)
{
    struct node * newn = NULL;
    struct node * temp = NULL;

    newn = new  struct node ;

    newn->data = iNo;
    newn->next = NULL;
    newn->prev = NULL;

    if(this->first == NULL)
    {
        this->first = newn;
    }
    else
    {
        temp = this->first;
        while(temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newn;
        newn->prev = temp;
    }
    this->iCount++;
}

template <class T>
void DoublyLL<T> :: InsertAtPos(int iNo, int iPos)
{
     struct node * temp = NULL;
    int i = 0;

   
    if((iPos < 1) || (iPos > iCount + 1))
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
        newn = new  struct node;

        newn->data = iNo;
        newn->next = NULL;
        newn->prev = NULL;

        temp = this->first;

        for(i = 1; i< iPos-1; i++)
        {
            temp = temp -> next;
        }
        newn->next = temp->next;
        temp->next = newn;

        temp->next = newn;
        newn->prev = temp;

    }
}

template <class T>
void DoublyLL<T> :: DeleteFirst()
{
     struct node * temp = NULL;
    if(this->first == NULL)
    {
        return;
    }
    else if(this->first->next == NULL)
    {
        delete this->first;
        this->first = NULL;
    }
    else
    {
        temp = this->first;
        this->first = this->first->next;
        delete temp;
       
    }
}

template <class T>
void DoublyLL<T> :: DeleteLast()
{
     struct node * temp = NULL;
    if(this->first == NULL)
    {
        return;
    }
    else if(this->first->next == NULL)
    {
        delete this->first;
        this->first = NULL;
    }
    else
    {
        temp = this->first;
        while(temp->next->next != NULL)
        {
            temp = temp->next;
        }
        delete temp->next;
        temp->next = NULL;
       
    }
}

template <class T>
void DoublyLL<T> :: DeleteAtPos(int iPos)
{
    int iCount = 0;
    int i = 0;
    iCount = Count();
     struct node * temp = NULL;

    if((iPos < 1) || (iPos > iCount))
    {
        printf("Invalid Position\n");
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
            temp = temp->next;
        }
        temp->next = temp->next->next;      
        free(temp->next->prev);     
        temp->next->prev = temp;       

    }
}


int main()
{
    DoublyLL <int> dobj;
    
    dobj.InsertFirst(51);
    dobj.InsertFirst(21);
    dobj.InsertFirst(11);

    dobj.Display();
    
    dobj.InsertLast(101);
    dobj.InsertLast(111);
    dobj.InsertLast(121);

    dobj.Display();

    dobj.DeleteFirst();

    dobj.Display();

    dobj.DeleteLast();

    dobj.Display();

    return 0;

}
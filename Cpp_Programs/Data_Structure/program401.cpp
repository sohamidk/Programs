#include<iostream>
using namespace std;
#pragma pack(1)


struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

class SinglyLL
{
    private :
        PNODE first;
        int icount;
    
    public :
        SinglyLL()
        {
            cout<<"Inside Constructor"<<endl;
            this->first = NULL;
            this->icount = 0;
        }

};
int main()
{
    SinglyLL sobj;
    
    //created 5 nodes
    sobj.first = NULL;  //Error due to access specifier
    sobj.icount = 15;   //Error

    return 0;

}
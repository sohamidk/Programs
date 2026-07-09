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
    public :
        PNODE first;
        int icount;
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
    sobj.first = NULL;  //DrawBack
    sobj.icount = 15;   //DrawBack

    return 0;

}
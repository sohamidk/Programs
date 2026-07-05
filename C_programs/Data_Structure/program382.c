#include<stdio.h>
#include<stdlib.h>

#pragma pack(1)

struct node
{
    int data;
    struct node * next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;


void Display(PNODE first)
{
    while(first != NULL)        //Type1
    {
        printf("| %d | -> ",first->data);
        first = first->next;
    }
    printf("NULL\n");
}

int Count(PNODE first)
{
    int iCount = 0;
    while(first != NULL)        //Type1
    {
        iCount++;
        first = first -> next;
    }
    return iCount;
}

void InsertFirsrt(PPNODE first, int iNo)
{
    PNODE newn = NULL;
    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;

    if(NULL == *first)  //LL is empty
    {
        *first = newn;
    }
    else        //LL contains atleast one node
    {
        newn->next = *first;
        *first = newn;
    }
}

void InsertLast(PPNODE first, int iNo)
{
    PNODE newn = NULL;
    newn = (PNODE)malloc(sizeof(NODE));
    PNODE temp = NULL;
    newn->data = iNo;
    newn->next = NULL;

   
    if(*first == NULL)  //LL is empty
    {
        *first = newn;
    }
    else        //LL contains atleast one node
    {
        temp = *first;
        while(temp -> next != NULL)     //Type2
        {
            temp = temp -> next;
        }
        temp->next = newn;
    }
}

void InsertAtPos(PPNODE first, int iNo, int iPos)
{}

void DeleteFirst(PPNODE first)
{
    PNODE temp = NULL;
    if(NULL == *first)      //LL is Empty
    {
        return ;
    }
    else if( NULL ==(*first) -> next)       //LL contains only one node
    {
        free(*first);
        *first = NULL;
    }
    else        //LL contains more than one node
    {
        temp = *first;
        *first = (*first)->next;
        free(temp);

    }
}

void DeleteLast(PPNODE first)
{
    PNODE temp = NULL;
    if(NULL == *first)      //LL is Empty
    {
        return ;
    }
    else if( NULL ==(*first) -> next)       //LL contains only one node
    {
        free(*first);
        *first = NULL;
    }
    else        //LL contains more than one node
    {
        temp = *first;
        while(temp->next->next != NULL)     //Type3
        {
            temp = temp -> next;
        }
        free(temp->next);
        temp->next = NULL;

    }
}

void DeleteAtPos(PPNODE first, int iPos)
{}



int main()
{
    PNODE head = NULL;
    int iRet = 0;
    InsertFirsrt(&head,121);
    InsertFirsrt(&head,101);
    InsertFirsrt(&head,51);
    InsertFirsrt(&head,21);
    InsertFirsrt(&head,11);

    Display(head);
    iRet = Count(head);
    printf("Number of Nodes are : %d\n",iRet);

    InsertLast(&head,111);

    Display(head);
    iRet = Count(head);
    printf("Number of Nodes are : %d\n",iRet);

    DeleteFirst(&head);

    Display(head);
    iRet = Count(head);
    printf("Number of Nodes are : %d\n",iRet);

    DeleteLast(&head);
    
    Display(head);
    iRet = Count(head);
    printf("Number of Nodes are : %d\n",iRet);
    return 0;
}
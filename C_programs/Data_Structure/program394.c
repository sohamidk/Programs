#include<stdio.h>
#include<stdlib.h>

#pragma pack(1)

struct node
{
    int data;
    struct node * next;
    struct node * prev;     // $
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

int Count(PNODE first)
{
    int iCount = 0;

    while(NULL != first)
    {
        iCount++;
        first = first->next;
    }
    return iCount;
}


void Display(PNODE first)
{
    printf("\nNULL <=> ");
    while(NULL != first)
    {
        printf("| %d | <=>",first->data);
        first = first->next;
    }
    printf(" NULL\n");
}


void InsertFirst(PPNODE first, int iNo)
{
    PNODE newn = NULL;
    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;
    newn->prev = NULL;      //$

    if(NULL == *first)      //LL is Empty
    {
        *first = newn;
    }
    else
    {
        newn->next = *first;
        (*first)->prev = newn;      //$
        *first = newn;
    }
}


void InsertLast(PPNODE first, int iNo)
{
    PNODE newn = NULL;
    PNODE temp = NULL;
    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;
    newn->prev = NULL;      //$

    if(NULL == *first)      //LL is Empty
    {
        *first = newn;
    }
    else
    {
        temp = *first;

        while(temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newn;      //newns address
        newn->prev = temp;      //$ adress of previous node
    }
}


void InsertAtPos(PPNODE first, int iNo, int iPos)
{
    int iCount = 0;
    int i = 0;
    
    PNODE newn = NULL;
    PNODE temp = 0;
    iCount = Count(*first);

    if((iPos < 1) || (iPos > iCount + 1))
    {
        printf("Invalid Position\n");
        return;
    }

    if(iPos == 1)
    {
        InsertFirst(first,iNo);
    }
    else if(iPos == iCount + 1)
    {
        InsertLast(first, iNo);
    }
    else
    {
        temp = *first;
        newn = (PNODE)malloc(sizeof(NODE));

        newn->data = iNo;
        newn->next = NULL;
        newn->prev = NULL;

        for(i = 1; i < iPos-1 ;i++)
        {
            temp = temp -> next;
        }

        newn->next = temp->next;        //Connected next nodes
        temp->next->prev = newn;        //Connects next nodes   $

        temp->next = newn;  
        newn->prev = temp;      //$
    }
}


void DeleteFirst(PPNODE first)
{
    if(NULL == *first)
    {
        return;
    }
    else if(NULL == (*first)->next)
    {
        free(*first);
        *first = NULL;
    }
    else
    {
        *first = (*first)->next;
        free((*first)->prev);   //$
        (*first)->prev = NULL;  //$
    }
}


void DeleteLast(PPNODE first)
{
    PNODE temp = NULL;

    if(NULL == *first)
    {
        return;
    }
    else if(NULL == (*first)->next)
    {
        free(*first);
        *first = NULL;
    }
    else
    {
        temp = *first;
        while(temp->next->next != NULL)
        {
            temp = temp->next;
        }
        free(temp->next);
        temp->next = NULL;
    }
}


void DeleteAtPos(PPNODE first, int iPos)
{
    int iCount = 0;
    iCount = Count(*first);

    if((iPos < 1) || (iPos > iCount))
    {
        printf("Invalid Position\n");
        return;
    }

    if(iPos == 1)
    {
        DeleteFirst(first);
    }
    else if(iPos == iCount)
    {
        DeleteLast(first);
    }
    else
    {
        

    }
}


int main()
{
    PNODE head = NULL;
    int iRet = 0;

    InsertFirst(&head,51);
    InsertFirst(&head,21);
    InsertFirst(&head,11);

    
    InsertLast(&head,101);
    InsertLast(&head,111);
    InsertLast(&head,121);


    Display(head);
    iRet = Count(head);
    printf("Number of Nodes are :%d\n",iRet);

    DeleteFirst(&head);
    Display(head);
    iRet = Count(head);
    printf("Number of Nodes are :%d\n",iRet);

    DeleteLast(&head);
    Display(head);
    iRet = Count(head);
    printf("Number of Nodes are :%d\n",iRet);

    InsertAtPos(&head,105,4);
    Display(head);
    iRet = Count(head);
    printf("Number of Nodes are :%d\n",iRet);
    
    return 0;
}
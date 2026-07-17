#include<stdio.h>
#include<stdlib.h>

#pragma pack(1)
//Doubly Linear
struct node
{
    int data;
    struct node * next;
    struct node * prev;     // $
};


int Count(struct node * first)
{
    int iCount = 0;

    while(NULL != first)
    {
        iCount++;
        first = first->next;
    }
    return iCount;
}


void Display(struct node * first)
{
    printf("\nNULL <=> ");
    while(NULL != first)
    {
        printf("| %d | <=>",first->data);
        first = first->next;
    }
    printf(" NULL\n");
}


void InsertFirst(struct node ** first, int iNo)
{
    struct node * newn = NULL;
    newn = (struct node *)malloc(sizeof(struct node));

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


void InsertLast(struct node ** first, int iNo)
{
    struct node * newn = NULL;
    struct node * temp = NULL;
    newn = (struct node *)malloc(sizeof(struct node));

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


void InsertAtPos(struct node ** first, int iNo, int iPos)
{
    int iCount = 0;
    int i = 0;
    
    struct node * newn = NULL;
    struct node * temp = 0;
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
        newn = (struct node *)malloc(sizeof(struct node));

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


void DeleteFirst(struct node ** first)
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


void DeleteLast(struct node ** first)
{
    struct node * temp = NULL;

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


void DeleteAtPos(struct node ** first, int iPos)
{
    int iCount = 0;
    int i = 0;
    iCount = Count(*first);
    struct node * temp = NULL;

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
        temp = *first;

        for(i = 1; i < iPos - 1; i++)
        {
            temp = temp->next;
        }
        temp->next = temp->next->next;      //400 to 600
        free(temp->next->prev);     //free 500 (previous because we assign 400 to 600)
        temp->next->prev = temp;       //500 erase houn 400 aala

    }
}


int main()
{
    struct node * head = NULL;
    int iRet = 0;

    InsertFirst(&head,51);
    InsertFirst(&head,21);
    InsertFirst(&head,11);

    
    InsertLast(&head,101);
    InsertLast(&head,111);
    InsertLast(&head,121);
    InsertLast(&head,151);


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

    DeleteAtPos(&head,4);
    Display(head);
    iRet = Count(head);
    printf("Number of Nodes are :%d\n",iRet);

    
    return 0;
}
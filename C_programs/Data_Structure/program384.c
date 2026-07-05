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
{
    int iCount = 0;
    int i = 0;
    iCount = Count(*first);

    PNODE temp = NULL;
    PNODE newn = NULL;

    if((iPos < 1) || (iPos > iCount + 1) )
    {
        printf("Invalid Position ");
        return;
    }

    if(iPos == 1)
    {
        InsertFirsrt(first,iNo);
    }
    else if(iPos == iCount + 1)
    {
        InsertLast(first,iNo);
    }
    else
    {
        newn = (PNODE)malloc(sizeof(NODE));

        newn->data = iNo;
        newn->next = NULL;

        temp = *first;
        for(i = 1; i< (iPos -1); i++)
        {
            temp = temp->next;
        }

        newn->next = temp->next;
        temp->next = newn;

    }

}

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
{
    int iCount = 0;
    int i = 0;

    PNODE temp = NULL;
    PNODE target = NULL;

    iCount = Count(*first);

    if((iPos < 1) || (iPos > iCount) )
    {
        printf("Invalid Position ");
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
        for(i = 1; i < iPos-1;i++)
        {
            temp = temp -> next;
        }
        target = temp->next;
        temp->next = target->next;
        free(target);

    }
}



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


    InsertAtPos(&head,105,4);

    Display(head);
    iRet = Count(head);
    printf("Number of Nodes are : %d\n",iRet);


    DeleteAtPos(&head,4);


    Display(head);
    iRet = Count(head);
    printf("Number of Nodes are : %d\n",iRet);

    return 0;
}
#include<stdio.h>
#include<stdlib.h>

#pragma pack(1)
//Singly Linear
struct node
{
    int data;
    struct node * next;
};


void Display(struct node * first)
{
    while(first != NULL)        //Type1
    {
        printf("| %d | -> ",first->data);
        first = first->next;
    }
    printf("NULL\n");
}

int Count(struct node * first)
{
    int iCount = 0;
    while(first != NULL)        //Type1
    {
        iCount++;
        first = first -> next;
    }
    return iCount;
}

void InsertFirsrt(struct node ** first, int iNo)
{
    struct node * newn = NULL;
    newn = (struct node *)malloc(sizeof(struct node));

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

void InsertLast(struct node ** first, int iNo)
{
    struct node * newn = NULL;
    newn = (struct node *)malloc(sizeof(struct node));

    struct node * temp = NULL;

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

void InsertAtPos(struct node ** first, int iNo, int iPos)
{
    int iCount = 0;
    int i = 0;
    iCount = Count(*first);

    struct node * temp = NULL;
    struct node * newn = NULL;

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
        newn = (struct node *)malloc(sizeof(struct node));

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

void DeleteFirst(struct node ** first)
{
    struct node * temp = NULL;
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

void DeleteLast(struct node ** first)
{
    struct node * temp = NULL;
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

void DeleteAtPos(struct node ** first, int iPos)
{
    int iCount = 0;
    int i = 0;

    struct node * temp = NULL;
    struct node * target = NULL;

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
    struct node * head = NULL;
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
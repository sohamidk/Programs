#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

#pragma pack(1)

struct node
{
    int data;
    struct node * lChild;
    struct node * rChild;

};


typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

// L-D-R
void InOrder(PNODE first)
{
    if(first != NULL)
    {
        InOrder(first->lChild);
        printf("%d\n",first->data);
        InOrder(first->rChild);
    }
}

// D-L-R
void PreOrder(PNODE first)
{
    if(first != NULL)
    {
        printf("%d\n",first->data);
        PreOrder(first->lChild);
        PreOrder(first->rChild);
    }
}

//L-R-D
void PostOrder(PNODE first)
{
    if(first != NULL)
    {
        PostOrder(first->lChild);
        PostOrder(first->rChild);
        printf("%d\n",first->data);
    }
}

void Insert(PPNODE first, int iNo)      //first = root
{
    PNODE temp = NULL;
    PNODE newn = NULL;
    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->lChild = NULL;
    newn->rChild = NULL;

    if(*first == NULL)
    {
        *first = newn;   //Root
    }
    else
    {
        temp = *first;
        
        while(1)
        {
            if(iNo > temp->data)
            {
                if(temp->rChild == NULL)
                {
                    temp->rChild = newn;
                    break;
                }
                temp = temp->rChild;
            }
            else if(iNo < temp->data)
            {
                if(temp->lChild == NULL)
                {
                    temp->lChild = newn;
                    break;
                }
                temp = temp->lChild;
            }
            else if(iNo == temp->data)
            {
                printf("Unable to insert as element is duplicate\n");
                free(newn);
                break;
            }
        }
    }
}


int Count(PNODE first)
{
    static int iCount = 0;
    if(first != NULL)
    {
        iCount++;
        Count(first->lChild);
        Count(first->rChild); 
    }
    return iCount;
}


int main()
{
    PNODE head = NULL;
    int iRet = 0;

    Insert(&head,11);
    Insert(&head,5);
    Insert(&head,17);

    printf("Inorder display : \n");
    InOrder(head);

    
    iRet = Count(head);
    printf("Number of nodes are : %d\n",iRet);
    return 0;
}
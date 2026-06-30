#include<stdio.h>
void Pattern(int iRow, int iCol)
{
    int i = 0, j = 0;
        if(iRow != iCol)
    {
        printf("Invalid input\n");
        printf("Numbers of rows and colomns should be equal\n");
        return;
    }
    for(i = 1; i<= iRow; i++)
    {
        for(j = 1; j<=iCol; j++)
        {
           if(i == j || j == 1|| j == iCol || i == 1 || i == iRow)
           {
            printf("%d\t",j);
           }
           else if(i >= j || i < j)
           {
            printf("\t");
           }
        }
        printf("\n");
    }
}
int main()
{
    int iValue1 = 0, iValue2 = 0;

    printf("Enter number of rows : ");
    scanf("%d", &iValue1);

    printf("Enter number of coloumns : ");
    scanf("%d", &iValue2);

    Pattern(iValue1, iValue2);
    return 0;
}
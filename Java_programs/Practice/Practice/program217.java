/*
    iRow = 6
    iCol = 6

    % % % % % %
    % @ @ @ @ %
    % @ @ @ @ %
    % @ @ @ @ %
    % @ @ @ @ %
    % % % % % %
*/

import java.util.*;

class Pattern
{
    public void Display(int iRow , int iCol)
    {
        int i =0, j = 0;
        if(iRow != iCol)
        {
            System.out.println("Invalid paramters");
            System.out.println("Number of rows and coloumns should be same..!");
        }
        for(i = 1; i<=iRow; i++)
        {

            for(j = 1; j <= iCol; j++)
            {
                if((j == 1 || j == iCol)  || (i == 1 || i == iRow) || i == j)     
                {
                    System.out.print("% ");
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
class program217
{
    
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter numbers of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter numbers of coloumns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);

        sobj.close();
    }
}

/*
    iRow = 4
    iCol = 4

    # $ # $
    # $ # $
    # $ # $
    # $ # $

*/
import java.util.*;
public class program196
{
    public static void Display(int iRow, int iCol)
    {
       int i = 0;
       int j = 0;

        for(i = 1; i<= iRow; i++)
        {  
            for(j = 1; j <= iCol; j++)
            {        
            if(j % 2 == 0)
            {
                System.out.print(" & " + " ");
            }
            else
            {
                System.out.print(" # " + " ");
            }
        }
            System.out.println();
        }
       
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the numer of Rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the numer of Coloumns : ");
        iValue2 = sobj.nextInt();

        Display(iValue1, iValue2);
        sobj.close();
    }

}

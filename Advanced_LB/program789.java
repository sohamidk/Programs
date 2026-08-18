import java.util.*;

public class program789
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0, iCol = 0;
        int i = 0, j = 0;

        System.out.println("Enter Numbe of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter Numbe of coloumns : ");
        iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter the elements of matrix : ");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Elements of matrix are : ");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.println(Arr[i][j]);
            }
        }


        sobj.close();
    }
}

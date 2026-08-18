import java.util.*;


class Matrix
{
    private int Arr[][];
    private int iRow;
    private int iCol;

    public Matrix(int iRow, int iCol)
    {
        System.out.println("Inside matrix constructor");

        this.iRow = iRow;
        this.iCol = iCol;

        Arr = new int[iRow][iCol];

    }

    protected void finalize()
    {
        System.out.println("Inside finalize method");
        Arr = null;
        System.gc();
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements of matrix : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
        sobj.close();
    }

    public void Display()
    {
        System.out.println("Elements of matrix are : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.println(Arr[i][j]);
            }
        }

    }
}

public class program793
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0, iCol = 0;
    

        System.out.println("Enter Numbe of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter Numbe of coloumns : ");
        iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow,iCol);

        mobj.Accept();
        mobj.Display();

        mobj = null;

        sobj.close();
        System.gc();        
    }
}

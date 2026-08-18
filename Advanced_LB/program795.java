import java.util.*;
import Marvellous.Matrix;

class MatrixLB extends Matrix
{
    public MatrixLB(int iRow, int iCol)
    {
        super(iRow, iCol);
    }
}

class program795
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0, iCol = 0;
        

        System.out.println("Enter Numbe of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter Numbe of coloumns : ");
        iCol = sobj.nextInt();

        MatrixLB mobj = new MatrixLB(iRow,iCol);

        mobj.Accept();
        mobj.Display();

        mobj = null;

        sobj.close();
        System.gc();        
    }
}

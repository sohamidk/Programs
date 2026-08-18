import java.util.*;

class Matrix
{
    protected int Arr[][];
    protected int iRow;
    protected int iCol;

    public Matrix(int iRow, int iCol)
    {
        System.out.println("Inside Constructor");

        this.iRow = iRow;
        this.iCol = iCol;

        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Elements in the matrix : ");
        
        for(int i = 0 ; i < iRow; i++)
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
        System.out.println("Elements in the matrix are : ");
        
        for(int i = 0 ; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }  
}

class MatrixLB extends Matrix
{
    public MatrixLB(int iRow, int iCol)
    {
        super(iRow, iCol);
    }

    public int SummationAll()
    {
        int iSum = 0, i = 0, j = 0;
        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                iSum = iSum + Arr[i][j];
            }
        }
        return iSum;
    }

    public int SummationRow()
    {
        int iSum = 0, i = 0, j = 0;
        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                iSum = iSum + Arr[i][j];
            }
            System.out.println("Summation of row no. : " + i  +" is : " + iSum);
            iSum = 0;
        }
        return iSum;
    }

    public int MaximumAll()
    {
        int i = 0, j = 0;
        int iMax = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] > iMax)
                {
                    iMax = Arr[i][j];
                }
            }
        }

        return iMax;
    }

}
public class program801 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int iRow = 0, iCol = 0;
        int iRet = 0;

        System.out.println("Enter Number of Rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter Number of Coloumns : ");
        iCol = sobj.nextInt();

        MatrixLB mobj = new MatrixLB(iRow, iCol);

        mobj.Accept();
        mobj.Display();

        iRet = mobj.SummationAll();
        System.out.println("Summation of all elements in matrix is : " + iRet);

        mobj.SummationRow();

        iRet = mobj.MaximumAll();
        System.out.println("Maximum of all elements in the matrix : " + iRet);


    }    
}

import java.util.*;

public class program788
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0, iCol = 0;

        System.out.println("Enter Numbe of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter Numbe of coloumns : ");
        iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println(Arr.length);

        System.out.println(Arr[0].length);

        sobj.close();
    }
}

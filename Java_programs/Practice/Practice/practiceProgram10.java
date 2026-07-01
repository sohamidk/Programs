import java.util.*;
public class practiceProgram10 
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0, iPos = 0, iAns = 0;
        int iMask = 1;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        System.out.println("Enter Bit Position : ");
        iPos = sobj.nextInt();

        iMask = iMask << (iPos -1);

        iAns = iNo & iMask;

        if(iAns == iMask)
        {
            System.out.println("Bit is ON");
        }
        else
        {
            System.out.println("Bit is OFF");
        }
        sobj.close();
    }
    
}

import java.util.*;

public class practiceProgram8
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0, iAns = 0;
        int iMask = 0x40;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        iAns = iNo & iMask;

        if(iAns == iMask)
        {
            System.out.println("Seventh bit is ON");
        }
        else
        {
            System.out.println("Seventh bit is OFF");
        }
        sobj.close();
    }
    
}

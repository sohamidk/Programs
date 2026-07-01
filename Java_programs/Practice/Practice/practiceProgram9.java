import java.util.*;

public class practiceProgram9
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0, iAns = 0;
        int iMask = 0x1000;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        iAns = iNo & iMask;

        if(iAns == iMask)
        {
            System.out.println("Thirteenth bit is ON");
        }
        else
        {
            System.out.println("Thirteenth bit is OFF");
        }
        sobj.close();
    }
    
}

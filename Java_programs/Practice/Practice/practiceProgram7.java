import java.util.*;

public class practiceProgram7
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0, iAns = 0;
        int iMask = 0x4;
        
        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        iAns = iNo & iMask;

        if(iAns == iMask)
        {
            System.out.println("Third bit is ON");
        }
        else
        {
            System.out.println("Third bit is OFF");
        }
        sobj.close();
    }
    
}

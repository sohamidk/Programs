import java.util.*;
class BitWise
{
    public int ToggleBit(int iNo, int iPos)
    {
        int iMask = 0x1;
        int iResult = 0;

        //Filter
        if(iPos < 1 || iPos > 32)
        {
            System.out.println("Invalid Position");
            return iNo;
        }

        //Mask Creation
        iMask = iMask << (iPos - 1);

        iResult = iNo ^ iMask;
        return iResult;
    }
}
public class practiceProgram17 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, iLocation = 0, iRet = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        System.out.println("Enter bit position : ");
        iLocation = sobj.nextInt();

        BitWise Bobj = new BitWise();
        iRet = Bobj.ToggleBit(iValue, iLocation);
        System.out.println("Updated Bit is : " + iRet);
        
        sobj.close();
    }
    
}

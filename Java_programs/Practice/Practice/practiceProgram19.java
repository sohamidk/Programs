import java.util.*;
class BitWise
{
    public int OffBit(int iNo, int iPos)
    {
        int iMask = 0x1;
        int iResult = 0;
        if(iPos < 1 || iPos > 32)
        {
            System.out.println("Invalid Bit Position");
            return iNo;
        }

        iMask = iMask << (iPos - 1);
        iMask = ~iMask;
        iResult = iNo & iMask;

        return iResult;
    }
}
public class practiceProgram19 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0,iLocation = 0, iRet = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        System.out.println("Enter bit position : ");
        iLocation = sobj.nextInt();

        BitWise Bobj = new BitWise();
        iRet = Bobj.OffBit(iValue,iLocation);
        
        System.out.println("Updated Bit is : " + iRet);
        
        sobj.close();
    }
    
}

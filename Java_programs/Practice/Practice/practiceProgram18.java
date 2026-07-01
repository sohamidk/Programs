import java.util.*;
class BitWise
{
    public int OffBit(int iNo)
    {
        int iMask = 0xfffffff7;
        int iResult = 0;

        iResult = iNo & iMask;

        return iResult;
    }
}
public class practiceProgram18 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, iRet = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        // System.out.println("Enter bit position : ");
        // iLocation = sobj.nextInt();

        BitWise Bobj = new BitWise();
        iRet = Bobj.OffBit(iValue);
        
        System.out.println("Updated Bit is : " + iRet);
        
        sobj.close();
    }
    
}

import java.util.*;

public class practiceProgram4 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0, iCount = 0, iDigit = 0;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();
        
        while(iNo != 0)
        {
            iDigit = iNo % 2;
            if(iDigit == 1)
            {
                iCount++;
            }
            iNo = iNo / 2;
        }
        System.out.println("Count of '1' digit is : " + iCount);
        sobj.close();

    }
    
}

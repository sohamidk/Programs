import java.util.Scanner;

class DigitX
{
    public int CountOddDigits(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNo != 0)
        {
            
            iDigit = iNo % 10; 
            if(iDigit % 2 != 0)
            {
                iCount++;
            }
            iNo = iNo / 10;
              

        }
        return iCount;
    }
   
}

public class program87 {
    public static void main(String[] args) {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();
        

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();
        int iRet = 0;

        iRet = dobj.CountOddDigits(iValue);
        System.out.println("Number of odd Digits : "+ iRet);
        sobj.close();
    }
}

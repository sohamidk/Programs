import java.util.Scanner;

class DigitX
{
    public int SumEvenDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;

        while(iNo != 0)
        {
            
            iDigit = iNo % 10; 
            if(iDigit % 2 == 0)
            {
               iSum = iSum + iDigit;
            }
            iNo = iNo / 10;
              

        }
        return iSum;
    }
   int iDigit = 0;
}

public class program90{


    public static void main(String[] args) {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();
        

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();
        int iRet = 0;

        iRet = dobj.SumEvenDigits(iValue);
        System.out.println("Summation Of Even digits : "+ iRet);
        sobj.close();
    }
}

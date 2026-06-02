import java.util.Scanner;

class DigitX
{
    public void CountEvenOddDigits(int iNo)
    {
        int iDigit = 0;
        int iCountEven = 0, iCountOdd = 0;

        while(iNo != 0)
        {
            
            iDigit = iNo % 10; 
            if(iDigit % 2 == 0)
            {
               iCountEven++;
            }
            else
            {
                 iCountOdd++;
            }
            iNo = iNo / 10;
        }
        System.out.println("Number of Even Digits :" + iCountEven);
        System.out.println("Number of Odd Digits :" + iCountOdd);
    }
   
}

public class program88{
    public static void main(String[] args) {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();
        

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();
        

        dobj.CountEvenOddDigits(iValue);
        sobj.close();
    }
}


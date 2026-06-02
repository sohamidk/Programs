import java.util.Scanner;

class DigitX
{
    public int ReverseDigits(int iNo)
    {
        int iDigit = 0;
        int iRev= 0;

        while(iNo != 0)
        {
            
            iDigit = iNo % 10; 
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;
              

        }
        return iRev;
    }
   
}

public class program92{


    public static void main(String[] args) {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();
        

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();
        int iRet = 0;

        iRet = dobj.ReverseDigits(iValue);
        System.out.println("Reverse Of Even digits : "+ iRet);
        sobj.close();
    }
}

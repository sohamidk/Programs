import java.util.Scanner;

class DigitX
{
    public void DisplayDigits(int iNo)
    {
        int iDigit = 0;
        for(;iNo != 0;)
        {
           iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
         } 
        
        // while(iNo != 0)
        // {
        //     iDigit = iNo % 10;
        //     System.out.println(iDigit);
        //     iNo = iNo / 10;
        // }
    }
   
}

public class program81{
    public static void main(String[] args) {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();
        

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        dobj.DisplayDigits(iValue);

        sobj.close();
    }
}


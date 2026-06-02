import java.util.Scanner;

class DigitX
{
    public void DisplayDigits(int iNo)
    {
        
        while(iNo != 0)
        {  
            System.out.println(iNo % 10);
            iNo = iNo / 10;
        }
    }
   
}

public class program80 {
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

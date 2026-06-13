import java.util.*;
public class program177
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        int iCount = 0;
        for(iCnt = 1, iCount = 1; iCnt <= iNo; iCnt++)
        {
           
            if(iCnt % 2 == 0)
            {
                System.out.print(" * ");
            }
            else
            {  
                System.out.print(iCount);
                iCount++;
            }
        } 
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the numer of elements : ");
        iValue = sobj.nextInt();

        Display(iValue);
        sobj.close();
    }

}

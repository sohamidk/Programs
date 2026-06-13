import java.util.*;
public class program190
{
    public static void Display()
    {
       int iCnt = 0;
       for(iCnt = 1; iCnt <= 4; iCnt++)
       {
            System.out.print("*\t");
       }
       System.out.println();

       for(iCnt = 1; iCnt <= 4; iCnt++)
       {
            System.out.print("*\t");
       }
       System.out.println();

        for(iCnt = 1; iCnt <= 4; iCnt++)
       {
            System.out.print("*\t");
       }
       System.out.println();
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
       // int iValue = 0;

       // System.out.println("Enter the numer of elements : ");
       // iValue = sobj.nextInt();

        Display();
        sobj.close();
    }

}

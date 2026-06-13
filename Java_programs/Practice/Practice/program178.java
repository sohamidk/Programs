import java.util.*;
public class program178
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
           
            if(iCnt % 2 == 0)
            {
                System.out.print(" * ");
            }
            else
            {  
                System.out.print((iCnt / 2) + 1);
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

import java.util.*;
public class program179
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        char ch = 'a';
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
           System.out.print(ch + " ");
           ch++;
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

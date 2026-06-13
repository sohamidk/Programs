import java.util.*;
public class program186
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        char ch = '\0';

        for(iCnt = 1, ch = 'A'; iCnt <= iNo; iCnt++, ch++)
        {
           if(iCnt % 2 == 0)
           {
            System.out.print(iCnt + " ");
           }
           else
           {
                System.out.print(ch+ " ");
                
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

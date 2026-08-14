import java.util.*;

public class p48_1 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int daysKept = 0;
        int fine = 0;
        int i = 0;

        System.out.println("Enter Number of days book was kept : ");
        daysKept = sobj.nextInt();

        if(daysKept <= 0)
        {
            System.out.println("Invalid input");
        }
        else if(daysKept <= 7 )
        {
            System.out.println("Returned on Time. No fine applicable");
        }
        else if(daysKept <= 12)
        {
            for(i = 8; i <= 12;i++)
            {
                if(i <= daysKept)
                {
                    fine = fine + 5;
                }
            }
            System.out.println("Total fine to be paid : Rs. " + fine);
        }
        else
        {
            for(i = 8; i <= 12;i++)
            {
                if(i <= daysKept)
                {
                    fine = fine + 5;
                }
            }

           for(i = 13; i <= daysKept;i++)
            {
                if(i <= daysKept)
                {
                    fine = fine + 10;
                }
            }
            System.out.println("Total fine to be paid : Rs. " + fine);
        }
        sobj.close();
    }    
}

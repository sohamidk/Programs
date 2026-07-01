import java.util.*;

public class practiceProgram15 
{
    public static void main(String[] args) 
    {   
        Scanner sobj = new Scanner(System.in);
        int iNo = 0, iMask = 0, iPos= 0;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        System.out.println("Enter bit Position : ");
        iPos = sobj.nextInt();

        iMask = 0x1;

        iMask = iMask << (iPos - 1);

        iNo = iNo ^ iMask ;

        System.out.println("Updated Number is : " + iNo);
        
        sobj.close();
    }
}

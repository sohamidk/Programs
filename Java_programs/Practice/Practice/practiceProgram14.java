import java.util.*;
//Toggle 11th bit

public class practiceProgram14 
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iMask = 0;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        iMask = 0x400;

        iNo = iNo ^ iMask;
        System.out.println("Updated number is : " + iNo);

        sobj.close();
    }
}

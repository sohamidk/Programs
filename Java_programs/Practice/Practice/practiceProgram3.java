import java.util.*;

public class practiceProgram3 
{
        public static void main(String[] args) 
        {
            Scanner sobj = new Scanner(System.in);
            int iNo1 = 0, iNo2 = 0, iAns = 0;
            
            System.out.println("Enter First Number : ");
            iNo1 = sobj.nextInt();

            System.out.println("Enter Second Number : ");
            iNo2 = sobj.nextInt();

            iAns = iNo1 | iNo2;
            System.out.println("OR Operation : " + iAns);

            iAns = iNo1 & iNo2;
            System.out.println("AND Operation : " + iAns);

            iAns = iNo1 ^ iNo2;
            System.out.println("XOR Operation : " + iAns);

            sobj.close();
        }
}

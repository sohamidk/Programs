import java.io.BufferedReader;
import java.io.InputStreamReader;


public class program806
{
    public static void main(String args[]) throws Exception
    {
        int iNo = 0;
        int iFact = 0;
        int i = 0;
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number : ");
        iNo = Integer.parseInt(bobj.readLine());

        iFact = 1;

        for(i = iNo; i >= 1; i--)
        {
            iFact = iFact * i;
        }
        System.out.println("Factorial is : " + iFact);
    }
}
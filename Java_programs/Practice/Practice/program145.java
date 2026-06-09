import java.util.*;
public class program145 
{
    public static void Update(int Arr[])
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < 5; iCnt++)
        {
            Arr[iCnt]++;
        }
    }
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int Brr[] = {10, 20, 30, 40, 50};

        System.out.println("Elements before function call : ");
        int iCnt =0;
        for(iCnt = 0; iCnt < 5; iCnt++)
        {
          System.out.println(Brr[iCnt]);
        }

        Update(Brr);
        System.out.println("Elements after function call : ");
        for(iCnt = 0; iCnt < 5; iCnt++)
        {
           System.out.println(Brr[iCnt]);
        }

    }
}

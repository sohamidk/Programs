import java.util.*;
class ArrayX
{
    public void Update(int Arr[])
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < 5; iCnt++)
        {
            Arr[iCnt]++;
        }
    }
}
public class program147
{
    public static void main(String args[])
    {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Elements before function call : ");
        int iCnt =0;
        for(iCnt = 0; iCnt < 5; iCnt++)
        {
          Brr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements after function call : ");
        for(iCnt = 0; iCnt < 5; iCnt++)
        {
           System.out.println(Brr[iCnt]);
        }

        }
        ArrayX aobj = new ArrayX();
        aobj.Update(Brr);
        System.out.println("Elements after function call : ");
        for(iCnt = 0; iCnt < 5; iCnt++)
        {
           System.out.println(Brr[iCnt]);
        }

    }
}

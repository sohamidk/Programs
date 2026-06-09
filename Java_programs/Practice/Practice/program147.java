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
       int iCnt = 0;

       System.out.println("Enter number of elements : ");
       int iLength = sobj.nextInt();

       int Brr[] = new int[iLength];

       System.out.println("Elements of the array are : \n");
       for(iCnt = 0; iCnt < iLength; iCnt++)
       {
            Brr[iCnt] = sobj.nextInt();
       }

       System.out.println("Elements of the array are : \n");
       for(iCnt = 0; iCnt < iLength; iCnt++)
       {
            System.out.println(Brr[iCnt]);
       }

       ArrayX aobj = new ArrayX();
       aobj.Update(Brr);

       System.out.println("Elements of the array after function call : \n");
       for(iCnt = 0; iCnt < iLength; iCnt++)
       {
            System.out.println(Brr[iCnt]);
       }

       Brr = null;
       System.gc();
       sobj.close();
    }
}

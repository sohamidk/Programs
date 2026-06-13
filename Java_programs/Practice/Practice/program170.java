import java.util.*;

class ArrayX
{
     private int Arr[];
     private int iSize;

     public ArrayX(int X)
     {
        iSize = X;
        Arr = new int[iSize];
     }

     int Summation()
     {
        int iCnt = 0, iSum = 0;
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return iSum;
     }

     void Accept()
     {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;
        System.out.println("Enter elemts of array : ");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
     }

     void Display()
     {
        int iCnt = 0;
         System.out.println("Enter elemts of array : ");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
     }


}

class program170
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int Brr[] = null;

        System.out.println("Enter the number of array : ");
        int iLength = sobj.nextInt();

        Brr = new int[iLength];

        ArrayX aobj = new ArrayX(iLength);
        aobj.Accept();
        aobj.Display();
        int iRet = 0;
        iRet = aobj.Summation();
        System.out.println("Summation is : " + iRet);

        System.gc();
        sobj.close();


    }

}
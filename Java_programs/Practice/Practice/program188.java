// Input : 11
// output : * * * # # # * * * #  #
//          1 2 3 4 5 6 7 8 9 10 11

import java.util.*;
public class program188
{
    public static void Display(int iNo)
    {
        int i = 0;
        int j = 0;
        int iCount = 0;
        for(i = 1; i <= iNo; i++)
        {
           for(j = 1; j <= 3 && iCount < iNo; j++)
           {
                if(i % 2 != 0)
                {
                    System.out.print("*" + " ");
                }
                else
                {
                    System.out.print("#" + " ");  

                } 
                 iCount++;
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

import java.util.*;

class ArrayX
{
    public int Arr[];
    public int iSize;


    public ArrayX(int iSize)
    {
        this.iSize = iSize;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of array");
        
        for(int i = 0; i < this.iSize;i++)
        {
            Arr[i] = sobj.nextInt();
        }

        sobj.close();
    }

    public void Display()
    {
        System.out.println("Elements of array are : ");
        
        for(int i = 0; i < this.iSize;i++)
        {
            System.out.print(Arr[i] + "\t");
        }
        System.out.println();
    }
}

public class program869 
{
    public static void main(String[] args) 
    {
        ArrayX aobj = new ArrayX(5);

        aobj.Accept();
        aobj.Display();

    }
}

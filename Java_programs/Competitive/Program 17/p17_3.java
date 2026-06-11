class Logic
{
    void findMaximum(int iNo1, int iNo2)
    {
        if(iNo1 > iNo2)
        {
            System.out.println(iNo1 + " is maximum");
        }
        else
        {
            System.out.println(iNo2 + " is maximum");
        }
    }
}

public class p17_3 
{
    public static void main(String[] args) 
    {
         Logic lobj = new Logic();
         lobj.findMaximum(20, 15); 
    }
   
}

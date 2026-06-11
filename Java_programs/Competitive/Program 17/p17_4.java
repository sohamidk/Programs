class Logic
{
    void findMin(int iNo1, int iNo2, int iNo3)
    {
        if(iNo1 < iNo2 || iNo1 < iNo3)
        {
            System.out.println(iNo1 + " is minimum");
        }
        else if(iNo2 < iNo1 || iNo2 < iNo3)
        {
            System.out.println(iNo2 + " is minimum");
        }
        else
        {
            System.out.println(iNo3 + " is minimum");
        }
    }
}

public class p17_4 {
    public static void main(String[] args) {
        Logic lobj = new Logic();
        lobj.findMin(3, 7, 6);
    }
    
}

class Logic
{
    void CheckSign(int iNo)
    {
        if(iNo < 0)
        {
            System.out.println("It is negative number");
        }
        else if(iNo == 0)
        {
            System.out.println("It is Zero");
        }
        else
        {
            System.out.println("It is positive number");
        }
    }
}
public class p18_5 {
        public static void main(String[] args) {
            Logic lobj = new Logic();
            lobj.CheckSign(-8);
        }
}

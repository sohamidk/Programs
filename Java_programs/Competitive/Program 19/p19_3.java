class Logic
{
    void checkDivisible(int iNo)
    {
        if(iNo % 5 == 0 || iNo % 11 == 0)
        {
            System.out.println("it is divisible by 5 & 11");
        }
        else
        {
            System.out.println("it is not divisible by 5 & 11");   
        }
    }
}
public class p19_3 {
        public static void main(String[] args) {
            Logic lobj = new Logic();
            lobj.checkDivisible(55);
        }
}

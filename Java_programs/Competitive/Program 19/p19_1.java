class Logic
{
    void CheckLeapYear(int year)
    {
        if(year % 4 == 0)
        {
            System.out.println("it is leap year");
        }
        else if(year % 100 == 0)
        {
            System.out.println("It is not leap year");
        }
        else if(year % 400 == 0)
        {
            System.out.println("it is leap year");
        }
        else
        {
            System.out.println("It is not leap year");
        }
    }
}
public class p19_1 
{
    public static void main(String[] args) {
        Logic lobj = new Logic();
        lobj.CheckLeapYear(2024);
    }
    
}

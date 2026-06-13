
class Logic
{
    void printDigits(int iNum)
    {
        int iDigit = 0;
        while(iNum > 0)
        {
             iDigit = iNum % 10;
             System.out.println(iDigit);
             iNum = iNum / 10;
        }
       
    }
}
public class p19_4 
{
    public static void main(String[] args) 
    {   
        Logic lobj = new Logic();
        lobj.printDigits(9865);
    }

}


class Logic
{
    void calculatePower(int base, int exp)
    {
        int iRes = 1;
        int iCnt = 0;
        for(iCnt = base; iCnt <= exp; iCnt++)
        {
             iRes = iRes * iCnt;
        }
         System.out.println(iRes);
    }
}
public class p19_5 {
    public static void main(String[] args) {
        Logic lobj = new Logic();
        lobj.calculatePower(2, 5);
    }
}

import java.util.Scanner;
class NumberX{
    public void DisplayFactor(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++){
            if((iNo % iCnt)== 0)
            {
                System.out.println(iCnt);
            }
        }
    }

}
public class program46 
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        
        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        nobj.DisplayFactor(iValue);
        sobj.close();
    }
}

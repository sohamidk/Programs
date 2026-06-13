class Logic
{
    void displayFactor(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.print(iCnt + " ");
            }
        }
    }  
}
public class p21_3{
        public static void main(String[] args) {
            Logic lobj = new Logic();
            lobj.displayFactor(20);
        }
}

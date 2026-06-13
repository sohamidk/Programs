class Logic
{
    void printDivisibleby2and3(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0 || iCnt% 3 == 0)
            {
                System.out.print(iCnt + " ");
            }
        }
    }  
}
public class p21_5{
        public static void main(String[] args) {
            Logic lobj = new Logic();
            lobj.printDivisibleby2and3(20);
        }
}

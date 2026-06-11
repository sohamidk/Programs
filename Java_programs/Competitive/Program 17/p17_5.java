class Logic
{
    void printTable(int iNo)
    {
        int iCnt = 0, iMulti = 1;
        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            iMulti = iNo * iCnt;
            System.out.println(iMulti + " ");
        }
    }
}
public class p17_5 {
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.printTable(5);
    }
}

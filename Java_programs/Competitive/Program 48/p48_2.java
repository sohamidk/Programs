import java.util.*;

public class p48_2 
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Current Balance : ");
        int cBalanace = sobj.nextInt();

        System.out.println("Amount of withdrawal : ");
        int withdraw = sobj.nextInt();

        if(cBalanace <= 1000)
        {
            System.out.println("Cannot withdraw amount. please maintain minimum balance ");
        }


        if(withdraw <= 25000 && withdraw % 100 == 0)
        {
            cBalanace = cBalanace - withdraw;
            System.out.println("Current Balance : " + cBalanace);
        }
        else
        {
            System.out.println("Transaction failed : Check Current Balance or maintain minimum balance");
        }

        sobj.close();
        
    }
    
}

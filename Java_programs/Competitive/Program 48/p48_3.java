import java.util.*;

public class p48_3 
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of subjects : ");
        int TotalSubjects = sobj.nextInt();

        int Marks[] = new int[TotalSubjects];

        int iSum = 0;
        int AvgMarks = 0;

        for(int i = 0; i < Marks.length;i++)
        {
            System.out.println("Enter Marks of subject : ");
            Marks[i] = sobj.nextInt();

            if(Marks[i] < 35)
            {
                System.out.println("Student Failed. ");
                return;
            }
        
            if(Marks[i] >= 0 && Marks[i] <= 100)
            {
                iSum = iSum + Marks[i];
                AvgMarks = iSum / Marks.length;
            }
        }

        if(AvgMarks >= 75)
        {
            System.out.println("Average Marks : " + AvgMarks);
            System.out.println("Final Result : Distinction");
        }
        else if(AvgMarks >= 60)
        {
            System.out.println("Average Marks : " + AvgMarks);
            System.out.println("Final Result : First Class");
        }
        else if(AvgMarks >= 50)
        {
            System.out.println("Average Marks : " + AvgMarks);
            System.out.println("Final Result : Second Class");
        }
        else if(AvgMarks > 50)
        {
            System.out.println("Average Marks : " + AvgMarks);
            System.out.println("Final Result : Pass");
        }
        
        sobj.close();
    }    
}

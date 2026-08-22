package Study_Tracker;

import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;


class StudyLog
{
    public LocalDate Date;
    public String Subject;
    public double Duration;
    public String Description;

    public StudyLog(LocalDate a, String b, double c, String d)
    {
        this.Date = a;
        this.Subject = b;
        this.Duration = c;
        this.Description = d;

    }

    @Override
    public String toString()
    {
        return Date + " | " + Subject + " | " + Duration + " | " + Description;
    }

    public LocalDate getDate()
    {
        return this.Date;
    }

    public String getSubject()
    {
        return this.Subject;
    }

    public double getDuration()
    {
        return this.Duration;
    }

    public String getDiscription()
    {
        return this.Description;
    }
}

class StudyTracker
{
    public ArrayList<StudyTracker> Database;

    public StudyTracker()
    {
        Database = new ArrayList<StudyTracker>();
    }

    public void InsertLog()
    {

    }

    public void DisplayLog()
    {

    }

    public void ExportToCSV()
    {

    }

    public void SummaryByDate()
    {

    }

    public void SummaryBySubject()
    {

    }

}

class program857
{
    public static void main(String[] args) throws Exception
    {
        int iChoice = 0;

        StudyTracker stobj = new StudyTracker();
        Scanner sobj = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        System.out.println("------Welcome to Marvellous Study Tracker-------");
        System.out.println("------------------------------------------------");

        do
        {
            System.out.println("------------------------------------------------");
            System.out.println("Please Select appropriate option : ");
            System.out.println("------------------------------------------------");


            System.out.println("1 : Insert new Study Log");
            System.out.println("2 : view all Study Logs");
            System.out.println("3 : Export Study Log to csv");
            System.out.println("4 : Summary of study log by date");
            System.out.println("5 : Summary of study log by subject");
            System.out.println("6 : Exit the application");  
            
            System.out.println("------------------------------------------------");

            iChoice = sobj.nextInt();

            switch(iChoice)
            {
                // Insert new log
                case 1 : 
                    stobj.InsertLog();
                    break;

                // View all study logs
                case 2 : 
                    stobj.DisplayLog();
                    break;

                // Export to csv
                case 3 :
                    stobj.ExportToCSV();
                    break;

                // Summary by date
                case 4 : 
                    stobj.SummaryByDate();
                    break;

                // Summary by Subject
                case 5 : 
                    stobj.SummaryBySubject();
                    break;

                // Terminate the project
                case 6 : 
                    break;

                default :
                    System.out.println("Please enter valid option");

            }

        }while(iChoice != 6);

        System.out.println("------------------------------------------------");
        System.out.println("-------Thank You for using Study Tracker -------");
        System.out.println("------------------------------------------------");

        
    }   // End of Main() 

} // End of class

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
    public ArrayList<StudyLog> Database;

    public StudyTracker()
    {
        Database = new ArrayList<StudyLog>();
    }

    public void InsertLog()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        System.out.println("------ Enter the details of your study ---------");
        System.out.println("------------------------------------------------");

        LocalDate lobj = LocalDate.now();

        System.out.println("We are entering the date as : " + lobj);

        System.out.println("Enter the name of subject like C/C++/Java");
        String sub = sobj.nextLine();

        System.out.println("Enter the time period of your study : ");
        double dur = sobj.nextDouble();

        // ISSUE resolved
        sobj.nextLine();

        System.out.println("Please provide the description of your study :");
        String desc = sobj.nextLine();

        StudyLog studyobj = new StudyLog(lobj, sub, dur, desc);

        Database.add(studyobj);

        System.out.println("Study log gets inserted successfully");

        System.out.println("------------------------------------------------");

    }

    public void DisplayLog()
    {
        System.out.println("------------------------------------------------");

        if(Database.isEmpty())
        {
            System.out.println("Nothing to display - database is empty");
            System.out.println("------------------------------------------------");

            return;
        }

        System.out.println("---- Log Report of Marvellous Study Tracker ----");
        System.out.println("------------------------------------------------");

        for(StudyLog s : Database)
        {
            System.out.println(s);
        }

        System.out.println("------------------------------------------------");

    }

    public void ExportToCSV()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("------------------------------------------------");

        if(Database.isEmpty())
        {
            System.out.println("Nothing to export - database is empty");
            System.out.println("------------------------------------------------");

            return;
        }

        System.out.println("Enter the name that you want to create for csv file");
        String fileName = sobj.nextLine();

        try(FileWriter fwobj = new FileWriter(fileName))
        {
            fwobj.write("Date,Subject,Duration of study,Description of study\n");

            for(StudyLog s : Database)
            {
                fwobj.write(s.getDate() + "," + 
                s.getSubject() + "," +
                s.getDuration() + "," +
                s.getDiscription() + "," +"\n"
                );              
            }

            System.out.println("Data gets exported to CSV successfully");
            
            System.out.println("------------------------------------------------");


        }
        catch(IOException iobj)
        {
            System.out.println(iobj);
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
    
    }

    public void SummaryByDate()
    {

    }

    public void SummaryBySubject()
    {

    }

}

class program861
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

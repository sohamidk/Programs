package Study_Tracker;
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
public class program851
{
    public static void main(String[] args) 
    {
        LocalDate lobj = LocalDate.now();

        ArrayList <StudyLog>Database = new ArrayList<StudyLog>();
        
        StudyLog s1 = new StudyLog(lobj, "C Programming", 4.5, "Pointers in C");
        StudyLog s2 = new StudyLog(lobj, "C++ Programming", 4.5, "Pointers in C");
        StudyLog s3 = new StudyLog(lobj, "Java Programming", 4.5, "Pointers in C");
        StudyLog s4 = new StudyLog(lobj, "Python Programming", 4.5, "Pointers in C");

        Database.add(s1);
        Database.add(s2);
        Database.add(s3);
        Database.add(s4);

        for(StudyLog s : Database)
        {
            System.out.println(s);
        }

        Database.clear();

        Database = null;

        System.gc();
    }    
}

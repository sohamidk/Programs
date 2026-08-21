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
public class program850
{
    public static void main(String[] args) 
    {
        LocalDate lobj = LocalDate.now();

        ArrayList <StudyLog>Database = new ArrayList<StudyLog>();
        
        StudyLog sobj1 = new StudyLog(lobj, "C Programming", 3.5, "Pointers in C");
        StudyLog sobj2 = new StudyLog(lobj, "C++ Programming", 3.5, "Pointers in C");
        StudyLog sobj3 = new StudyLog(lobj, "Java Programming", 3.5, "Pointers in C");

        Database.add(sobj1);
        Database.add(sobj2);
        Database.add(sobj3);

        for(StudyLog sobj : Database)
        {
            System.out.println(sobj);
        }

        Database.remove(1);

        System.out.println("After Removal");

        for(StudyLog sobj : Database)
        {
            System.out.println(sobj);
        }
    }    
}

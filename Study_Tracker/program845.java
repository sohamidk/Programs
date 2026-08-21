package Study_Tracker;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/* class Object
{
    public String toString()
    {}
}*/

// class StudyLog extends Object
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

    //Override
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
public class program845
{
    public static void main(String[] args) 
    {
        LocalDate lobj = LocalDate.now();

        StudyLog sobj1 = new StudyLog(lobj, "C Programming", 3.5, "Pointer in C");
        
        System.out.println(sobj1.Duration);   // Error

        System.out.println(sobj1.getDate());
        System.out.println(sobj1.getSubject());
        System.out.println(sobj1.getDuration());
        System.out.println(sobj1.getDiscription());
        

    }    
}

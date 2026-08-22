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
    public ArrayList<StudyTracker> Database =  new ArrayList<StudyTracker>();

    

}

class program855
{
    public static void main(String[] args) throws Exception
    {
        StudyTracker stobj = new StudyTracker();
        
    }    
}

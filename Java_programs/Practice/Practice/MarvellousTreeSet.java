package Java_programs.Practice.Practice;
import java.util.*;
public class MarvellousTreeSet
{
    public static void main(String args[])
    {
        TreeSet<String> set = new TreeSet<>();

        set.add("Marvellous");
        set.add("PPA");
        set.add("LB");     

        System.out.println("Sorted set : " + set);
        System.out.println("First : " + set.first());
    }
    
}

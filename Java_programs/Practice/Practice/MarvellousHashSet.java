package Java_programs.Practice.Practice;
import java.util.*;
public class MarvellousHashSet
{
    public static void main(String args[])
    {
        HashSet<String> set = new HashSet<>();

        set.add("Marvellous");
        set.add("Infosystem");
        set.add("Marvellous");      //Duplicate ignored

        System.out.println(set);
    }
    
}

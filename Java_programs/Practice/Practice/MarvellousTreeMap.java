package Java_programs.Practice.Practice;
import java.util.*;
public class MarvellousTreeMap
{
    public static void main(String args[])
    {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(2, "Marvellous");
        map.put(1, "Infosystems");

        System.out.println("Sorted Map : " + map);
        System.out.println("First Key : " + map.firstKey());
    }
    
}

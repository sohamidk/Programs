package Java_programs.Practice.Practice;
import java.util.*;
public class MarvellousLinkedList 
{
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<>();

        list.add("Marvellous");
        list.addFirst("Ganesh");
        list.addLast("Saraswati");

        System.out.println(list);

        list.removeFirst();

        System.out.println("After removal : " + list);
    }
    
}

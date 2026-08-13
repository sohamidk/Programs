package Java_programs.Practice.Practice;
import java.util.*;
public class MarvellousPriorityQueue
{
    public static void main(String args[])
    {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Marvellous");
        pq.add("PPA");
        pq.add("LB");

        System.out.println("Peek : " + pq.peek());
        System.out.println("Poll : " + pq.poll());

        System.out.println("After Poll : " + pq);
    }
    
}

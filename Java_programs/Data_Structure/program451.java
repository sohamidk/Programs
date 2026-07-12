package Java_programs.Data_Structure;

class node
{
    public int data;
    public node next;
    
    node(int iNo)
    {
        this.data = iNo;
        this.next = null;
    }

}


class SinglyLL
{
    public node first;
    public int iCount;

    public SinglyLL()       //constructor
    {
        System.out.println("Inside Constructor");
        this.first = null;
        this.iCount = 0;
    }


}


class program451 
{
    public static void main(String[] args)
    {
        SinglyLL sobj = new SinglyLL();
        
    }
    
}

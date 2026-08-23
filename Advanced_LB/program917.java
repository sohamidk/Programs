class node
{
    public int data;
    public node next;

    public node(int no)
    {
        this.data = no;
        this.next = null;
    }
}

class SinglyLL
{
    public node first;
    public int iCount;

    public SinglyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void InsertFirst(int iNo)
    {
        node newn = new node(iNo);
        
        newn.next = first;
        first = newn;

        iCount++;
    }

    public int Count()
    {
        return iCount;
    }

    public void Display()
    {
        node temp = null;

        temp = first;

        while(temp != null)
        {
            System.out.print("| " + temp.data + " | -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    

    public void InsertLast(int iNo)
    {
        node newn = new node(iNo);

        node temp = null;
        temp = first;

        if(first == null)
        {
            first = newn;
        }
        else
        {
            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
        }
        iCount++;
    }  

    public void ReverseLinkedList()
    {
        node previous  = null;
        node Current = null;
        node Next = null;
        
        if(first == null)
        {
            return;
        }

        Current = first;

        while(Current != null)
        {
            Next = Current.next;
            Current.next = previous;
            previous = Current;
            Current = Next;
        }
        
        first = previous;
    }
}
class program917
{
    public static void main(String[] args) 
    {
        int iRet = 0;
        SinglyLL sobj = new SinglyLL();

        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);
        sobj.InsertLast(101);
        sobj.InsertLast(111);
        
        sobj.Display();

        sobj.ReverseLinkedList();

        System.out.println("Linked List after reverse : ");
        sobj.Display();
        
    }
}
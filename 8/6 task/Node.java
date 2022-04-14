import java.util.Scanner;
class Node {
    public int value;
    public Node next;
    Node (int value, Node next)
    {
        this.value=value;
        this.next=next;
    }
    public void AddFirst()
    {
        Node temp=new Node(this.value,this.next);
        System.out.println("Insert number");
        Scanner InCMD=new Scanner(System.in);
        int i;
        i=InCMD.nextInt();
        this.set(i,temp);
    }
    public void AddLast()
    {
        System.out.println("Insert number");
        Scanner InCMD=new Scanner(System.in);
        int i;
        i=InCMD.nextInt();
        Node temp=new Node(i, null);
        Node ref=this;
        while(ref.next!=null) ref=ref.next;
        ref.next=temp;
    }
    public void createHead()
    {
        Node tail=this;
        for(int i=0;i!=5;i++)
        {
            tail.next=new Node(i+1,null);
            tail=tail.next;
        }
    }
    public void set(int value,Node next)
    {
        this.value=value;
        this.next=next;
    }
    public void set (Node check)
    {
        value=check.value;
        next=check.next;
    }
    public void createTail()
    {
         Node temp=null;
        for(int i=9;i>=4;i--)
        {
            temp=new Node(i,temp);
            this.set(temp);
        }
    }
    public String toString()
    {
        String answer="";
        Node ref=this;
        while(ref!=null)
        {
            answer+=ref.value+" ";
            ref=ref.next;
        }
        return answer;
    }
    public void Insert()
    {
        System.out.println("Insert number");
        Scanner InCMD=new Scanner(System.in);
        int i,insert_number=0,counter=1;
        i=InCMD.nextInt();
        System.out.println("Insert position");
        insert_number=InCMD.nextInt();
        Node temp=new Node(i, null);
        Node ref=this;
        while(ref.next!=null&& counter<insert_number) {ref=ref.next;counter++;}
        temp.next=ref.next;
        ref.next=temp;
    }
    public void RemoveFirst()
    {
        this.set(this.next);
    }
    public void RemoveLast()
    {
        Node ref=this;
        while(ref.next.next!=null)
        {
            ref=ref.next;
        }
        ref.next=null;
    }
    public void Remove()
    {
        Node ref=this;
        int i=1, insert_number=0;
        Scanner InCMD=new Scanner(System.in);
        System.out.println("Insert position");
        insert_number=InCMD.nextInt();
        while(ref.next!=null && i<insert_number)
        {
            ref=ref.next;
            i++;
        }
        ref.next=ref.next.next;
    }
    public void createHeadRec()
    {
        if(this.value==5) return;
        this.next=new Node(this.value+1,null);
        this.next.createHeadRec();
    }
    public void createTailRec()
    {
        if(value==5) return;
        Node temp=null;
        temp=new Node (this.value-1,temp);
        temp.createTailRec();
        System.out.print(temp.toStringRec());
        if(temp.value==4)
        {
            Node ref=temp;
            while(ref!=null)
            {
                this.set(ref.value,ref.next);
                ref=ref.next;
            }
        }
    }
    public String toStringRec()
        {
        String answer=" "+this.value;
        if(this.next==null) return answer;
        answer+=this.next.toStringRec();
        return answer;
    }
}
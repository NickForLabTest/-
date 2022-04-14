class Node 
{
    public int value;
    public Node next;
    Node (int _value,Node _next)
    {
        value=_value;
        next=_next;
    }
    void set (Node _copy)
    {
        value=_copy.value;
        next=_copy.next;
    }
    public void add(int i)
    {
        Node temp=null;
        temp=new Node(i,temp);
        Node ref=this;
        while(ref.next!=null) ref=ref.next;
        ref.next=temp;
    }
    public String output()
    {
        String answer="";
        Node ref=this;
        if(ref.next!=null) ref=ref.next;
        while(ref!=null) { answer+=ref.value+" ";ref=ref.next;}
        return answer;
    }
    public void task()
    {
        Node ref=this;
        int sum=0;
        int count=0;
        while(ref!=null)
        {
            if(ref.value%3==0 && ref.value!=0){sum+=ref.value; count++;}
            ref=ref.next;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Count: "+count);
        System.out.println("Average: "+(float)sum/count);

    }
    public void task2()
    {
        Node ref=this;
        if(ref.next!=null) ref=ref.next;
        int min=ref.value,max=ref.value,counter=0,counter_min=0,counter_max=0;
        while(ref!=null)
        {
            if(min>ref.value) {min=ref.value;counter_min=counter;};
            if(max<ref.value) {max=ref.value;counter_max=counter;}
            counter++;
            ref=ref.next;
            
        }
        counter=0;
        ref=this;
        if(ref.next!=null) ref=ref.next;
        while(ref!=null)
        {
            if(counter==counter_max) ref.value=min;
            if(counter==counter_min) ref.value=max;
            ref=ref.next;
            counter++;
        }
    }
}
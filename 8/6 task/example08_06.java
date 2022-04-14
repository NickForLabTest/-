public class example08_06{
    public static void main(String args[])
    {
        System.out.println("-------------");
        System.out.println("Create head method:");
       Node test1=new Node(0, null); 
        test1.createHead();
        System.out.println(test1.toString());
        System.out.println("-------------");
        System.out.println("Create tail method");
        Node test2=new Node(0,null);
        test2.createTail();
        System.out.println(test2.toString());
        System.out.println("-------------");
        System.out.println("Add First method");
        test1.AddFirst();
        System.out.println(test1.toString()); 
        System.out.println("-------------");
        System.out.println("Add last method");
        test1.AddLast();
        System.out.println(test1.toString()); 
        System.out.println("-------------");
        System.out.println("Remove first method");
        test1.RemoveFirst();
        System.out.println(test1.toString()); 
        System.out.println("-------------");
        System.out.println("Remove last method");
        test1.RemoveLast();
        System.out.println(test1.toString()); 
        System.out.println("-------------");
        System.out.println("Remove method");
        test1.Remove();
        System.out.println(test1.toString()); 
        System.out.println("-------------");
        System.out.println("Create head rec method");
        Node test3=new Node(0,null);
        test3.createHeadRec();
        System.out.println(test3.toStringRec());
        System.out.println("-------------");
        System.out.println("Create tail rec method");
        Node test4=new Node(10,null);
        test4.createTailRec();
        System.out.println(test4.toStringRec());
        System.out.println("-------------");

}
}
public  class fib{
   private static int step=0;
   private static int counter=0;
    public static int f(int n){ 
        //System.out.print(n+"+");
        output();
        System.out.println(n + " step="+(++counter));
        step++;
        if (n==0){step--;return 0;}
        if (n==1){step--;return 1;}
        step++;

        return f(n-2)+f(n-1);
        }
        public static void output()
        {
            for(int i=0;i<step;i++)
            System.out.print(" ");
        }
    public static void main(String args[])
    {
        int result=f(4);
        System.out.print("Result:");
        System.out.println(result);
    }
}
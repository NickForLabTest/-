class example06_07
{
    static int[] array(char a[])
    {
        int array[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        array[i]=(int)a[i];
        return array;
    }
    public static void main(String args[])
    {
        char a[]={'H','E','L','L','O'};
        System.out.println("Char array:");
        System.out.println(a);
        System.out.println("Int array:");
        for(int i: array(a))
        System.out.print(i+" ");
    }
}
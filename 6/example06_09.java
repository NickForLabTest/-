class example06_09
{
    static void pair(char a[])
    {
        for(int i=0;i<(a.length)/2;i++)
        {
        a[i]^=a[a.length-1-i];
        a[a.length-1-i]^=a[i];
        a[i]^=a[a.length-1-i];
        }
    }
    static public void main(String args[])
    {
        char array[]={'H','E','L','L','O'};
        pair(array);
        System.out.print(array);

    }
}
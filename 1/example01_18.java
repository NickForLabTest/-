public class example01_18{
    static double a=10.0,b=4.0,c,ta=a,tb=b;
    public static double hyp(){
        return c=Math.sqrt(a*a+b*b);
    }
    public static double talog(){
        return ta=Math.log(a);
    }
    public static double tblog(){
        return tb=Math.log(b);
    }
    public static double tbexp(){
        return tb=Math.exp(tb);
    }
    public static double taexp(){
        return ta=Math.exp(ta);
    }

    public static void main(String args[]){
        talog();
        tblog();
        System.out.println("katet a=" + a); 
        System.out.println("katet b=" + b); 
        System.out.println("hypotenuse c=" + hyp());
        System.out.println("a^b=" + (Math.pow(taexp(),tbexp()))); 

    }
}
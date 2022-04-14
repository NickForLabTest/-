public class Main{
    public static void main(String args[])
    {
        superClassTest superClassObject = new superClassTest("Transfer in superclass constructor");
        String className = superClassObject.toString();
        System.out.println(className);
        subClassTest subClassObject1 = new subClassTest("Transfer in subclass constructor");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);
        subClassTest subClassObject2 = new subClassTest("Transfer in subclass constructor", "with two parametr");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);

    }
}
public class example09_01_06
{
    public static void main(String[] args) {
        try {
        System.out.println("0");
        throw new NullPointerException("error");}
         catch (ArithmeticException e) { System.out.println("1" );}
         catch (RuntimeException e) { System.out.println("3" );}
         catch (Exception e) { System.out.println("2" );
        }
        System.out.println("4");
        }
}


/*
    Ход работы:
    1) Выводится число 0
    2) Отправляется ошибка NullPointerException
    3) Ловится через 2 catch и выводится число 3
    4) Все остальные catch пропускаются и выводится число 4

*/


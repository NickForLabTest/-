public class example09_01_07
{
    public static void main(String[] args) {
        try {
        System.out.println("0");
        throw new NullPointerException("error");
        } catch (NullPointerException e) {System.out.println("1" );}
            try{
            throw new ArithmeticException();
            }
         catch (ArithmeticException e) { System.out.println("2" );}
        System.out.println("3");
    }
}

/*
    Ход работы:
    1) Выводится число 0
    2) Отправляется ошибка NullPointerException
    3) Ловится через 1 catch и выводится число 1
    4) Отправляется ошибка  ArithmeticException
    5) Ловится через 2 catch и выводится число 2
    6) Выводится число 3
*/

public class example09_01_11
{
    public static void main(String[] args) {
        try {
        System.out.println("0");
        throw new NullPointerException("error");
        } catch (NullPointerException e) { System.out.println("1" );}
        finally { System.out.println("2" );}
        System.out.println("3");
        }
}

/*
    Ход работы:
    1) Выводится число 0
    2) Отправляется ошибка NullPointerException
    3) Ошибка ловится и выводится число 1
    4) Совершается переход к метке finally и выводится число 2
    5) Выводится число 3
*/

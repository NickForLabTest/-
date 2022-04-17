public class example09_01_04
{
    public static void main(String[] args) {
        try {
        System.out.println("0");
        throw new RuntimeException("error");
        } catch (NullPointerException e) { System.out.println("1" );}
        catch (Exception e) { System.out.println("2" );}
        catch (Error e) { System.out.println("3" );}
        System.out.println("4");
        }
}


/*
    Ход работы:
    1) Выводится число 0
    2) Отправляется ошибка RuntimeException
    3) Ловится через 2 catch и выводится число 2
    4) Выводится число 4

*/
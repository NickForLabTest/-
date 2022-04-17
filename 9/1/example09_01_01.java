public class example09_01_01
{
    public static void main(String[] args) {
        try {
        System.out.println("0");
        throw new RuntimeException("Unchecable error");
        } catch (RuntimeException e) { // исключение перехвачено
        System.out.println("1 "+ e); // исключение обработано
        }
        System.out.println("2");
        }
}


/*
    Ход программы:
    1) Выводится число 0
    2) Отправляется ошибка RuntimeException
    3) Через catch ловится данная ошибка и выводится число 1 и описание ошибки
    4) Выводится число 2


*/
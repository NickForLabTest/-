public class example09_01_02
{
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Unchecable error"); 
        } catch (Exception e) { System.out.println("2 "+ e );
        }
        System.out.println("3");
        }
}

/*
    Ход работы:
    1) Выводится число 0ж
    2) Отправляется ошибка RuntimeException
    3) Ошибка ловится через catch и выводит цифру 2 и описание ошибки
    4) Выводится число 3



*/
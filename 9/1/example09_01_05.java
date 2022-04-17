public class example09_01_05
{
    public static void main(String[] args) {
        try {
        System.out.println("0");
        throw new RuntimeException("error");
        } catch (NullPointerException e) { System.out.println("1" );
        }
        System.out.println("2");
        }
}

/*
    Ход работы:
    1) Выводится число 0
    2) Отправляется ошибка RuntimeException
    3) Ошибка нигде не ловится и поэтому программа выводит ошибку и указывает строку, в которой эта ошибка произошла (в данном примере строка 6)

*/
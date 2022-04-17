public class example09_01_13
{
    public static void main(String[] args) {
        try {
            int l = args.length; System.out.println("Size of array= " + l);
            int h=10/l;
            args[l + 1] = "10";
        } catch (ArithmeticException e) { System.out.println("division by zero");}
        catch (ArrayIndexOutOfBoundsException e) { System.out.println("Index does not exist");}
    }
}

/*
    Ход работы:
    1) Значению l присваивается размер массива args, элементы которого вводятся в настройках проекта. Выводится значение l
    2) Проверяется размерность массива через переменную h. Если произойдет деление на ноль, то возникнет ошибка ArithmeticException, которая обработается через 1 catch и выведет "division by zero"
    3) Если в проекте элементы args заданы корректно, отправится ошибка ArrayIndexOutOfBoundsException, т.к в строке 7 идёт обращение к несуществующему индексу массива args. Выведется Index does not exist
*/

public class example09_01_14
{
    public static void m(int x) throws ArithmeticException{ 
        int h=10/x;
    }
    public static void main(String[] args) {
    try {
        int l = args.length;
        System.out.println("Size of array= " + l);
        m(l);
        }
    catch (ArithmeticException e) { System.out.println("Error: division by zero");}
    } 
}

/*
    Ход работы:
    1) Переменной l задается значение размера массива args, элементы которого задаются в настройках проекта.
    2) Выводится значение переменной l
    3) Вызывается функция m(int), аргументом которой служит переменная l
    4) Если элементы массива args заданы корректно, то переменная h будет приравнена к какому-либо числу.
    Если массив args не содержит никаких элементов, то отправляется ошибка ArithmeticException, которая отрабатывается 
    и выводит Error: division by zero
*/
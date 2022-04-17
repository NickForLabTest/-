public class example09_01_09
{
    public static int m(){ try {
        System.out.println("0");
        return 55; // выход из метода
        } finally { System.out.println("1");} 
    }
        public static void main(String[] args) { 
            System.out.println(m());
        }
}

/*
    Ход работы:
    1) Через System.out.println вызывается метод m()
    2) Выводится число 0
    3) Т.к присутствует метка finally, то данная метка обязательно выполняется. Выводится число 1
    4) Т.к никакой ошибки в процессе выполнения программы выявлено не было, то число 55 выполняется и выводится на экран.
*/
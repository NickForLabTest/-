public class example09_01_08
{
    public static int m(){
        try {
        System.out.println("0");
        throw new RuntimeException();
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
    3) Отправляется ошибка RuntimeException
    4) Т.к присутствует метка finally, то она обязательно выполняется, даже если ошибка не отработалась через catch. Выводится число 1
    5) Т.к присутствует неотработанная ошибка RuntimeException, то она выводится в консоль, указывая строки, которые вызвали данную ошибку.
    В данном случае сначала выводится строка 6, а потом строка 10. 
*/

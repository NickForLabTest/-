public class example09_01_12
{
    public static void m(String str, double chislo){
        if (str==null) {throw new IllegalArgumentException("String input error");}
        if (chislo>0.001) {throw new IllegalArgumentException("Wrong number");} 
    }

        public static void main(String[] args) { 
            m(null,0.000001);
        }
}

/*
    Ход работы:
    1) Вызывается функция m(String,double)
    2) Т.к строка равна null, то 1 if приводит к отправлению ошибки IllegalArgumentException
    3) Т.к ошибка никак не отрабатывается, ошибка выводится в консоль, а также указывает строки, которые привели к этой ошибке.
    В данном случае указывается строка 4 и 9
*/

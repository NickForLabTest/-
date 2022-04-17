public class example09_01_10
{
    public static int m(){ try {
        System.out.println("0"); return 15;
        } finally { System.out.println("1"); return 20;} 
    }
        public static void main(String[] args) { System.out.println(m());
        }
}


/*
    Ход работы:
    1) С помощью System.out.println вызывается метод m()
    2) Выводится число 0
    3) Т.к присутствует метка finally, то данная метка обязательно выполняется. Выводится число 1
    4) return 15 заменяется на return 20, поэтому возвращается число 20 и выводится в командную строку
*/
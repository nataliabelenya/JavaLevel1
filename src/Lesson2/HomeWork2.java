package Lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(Method1(11,5));
        Method2();
        System.out.println(Method3(8));

        //4. Написать метод, которому в качестве аргументов передается строка и число,
        // метод должен отпечатать в консоль указанную строку, указанное количество раз;

        int a = 5;
        while (a > 0) {
            System.out.println("Hello, Natalia");
            a--;}

    }



    //1. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.
    public static boolean Method1(int a, int b) {
        int sum = a + b;
        if (sum <=10 && sum<=20) {
            return false;
        }
        else return true;
    }



    // 2. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или
    // отрицательное. Замечание: ноль считаем положительным числом.

    public static void Method2() {
        int a=15;
        if (a >= 0) System.out.println("Число " + a + " " + "положительное");
        else System.out.println("Число " + a + " " + " отрицательное");

    }


    //3. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false
    // если положительное.

    public static boolean Method3(int a) {
        if (a < 0) {
            return true;
        }
        else return false;
    }


}
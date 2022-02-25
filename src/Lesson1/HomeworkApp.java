package Lesson1;


public class HomeworkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

        public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {

        int a = 3, b = 5;
        int sum = a + b;
        System.out.println(sum);

        if (sum >= 0) {
            System.out.println("Summa polozhitelnaya");
        }
        if (sum < 0) {
            System.out.println("Summa otritsatelnaya");
        }

    }

    public static void printColor() {

        int value = 155;

        if (value <= 0) {
            System.out.println("Krasniy");
        }

        if (value > 0 && value <= 100) {
            System.out.println("Zheltiy");
        }

        if (value > 100) {
            System.out.println("Zeleniy");
        }

    }

    public static void compareNumbers() {
        int a = 3, b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        }

        if (a < b){
            System.out.println("a < b");
        }

    }
}



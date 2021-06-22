package qwe;

public class Main {

    public static void main(String[] args) {
        printThreeWords();
        printCheckSumSing();
        printColor();
        compareNumbers();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void printCheckSumSing() {
        int a = 2;
        int b = 1;
        if (a + b >= 0)
        {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 2;

        if (value <= 0) {
            System.out.println("Красный");
        } if (0 < value  && value <= 100) {
            System.out.println("Желтый");
        } if ( value > 100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 1;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        public static void compan(){
            int x = 1;
            int y = 5;
            if (x >= y) {
                System.out.println("x >= y");
            } else {
                System.out.println("x < y");
            }
        }


    }





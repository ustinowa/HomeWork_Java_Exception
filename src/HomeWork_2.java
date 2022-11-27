import java.util.Scanner;

public class HomeWork_2 {
    //Task_1
    public static void EnterFloatNumber() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Введите дробное число");
                if (!scanner.hasNextFloat()) throw new RuntimeException("Введены неверные данные. Попробуйте еще раз");
            } catch (RuntimeException e) {
                System.out.println(e);
                String line = scanner.nextLine();
            }
            float num = scanner.nextFloat();
            System.out.println("Введенное значение: " + num);
            break;
        }
    }

    //Task_2
    public static void task2() {
        try {
            int[] intArray = new int[9];
            intArray[8] = 5;
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    //    Task_3
    public static void printSum(Integer a, Integer b) throws Exception {
        System.out.println(a + b);
    }

    //Task_4
    public static void EnterString() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите строку");
            String str = scanner.nextLine();
            if (str == "") throw new RuntimeException("Нельзя вводить пустую строку");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("Task_1");
        HomeWork_2.EnterFloatNumber();
        System.out.println("Task_2");
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
        System.out.println("Task_4");
        HomeWork_2.EnterString();
    }
}

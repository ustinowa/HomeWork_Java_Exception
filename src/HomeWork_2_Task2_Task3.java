public class HomeWork_2_Task2_Task3 {
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
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        System.out.println("Задание 2");
        HomeWork_2_Task2_Task3.task2();
        System.out.println("Задание 3");
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
    }
}

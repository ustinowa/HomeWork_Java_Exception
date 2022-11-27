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

        System.out.println("Task_4");
        HomeWork_2.EnterString();
    }
}

import java.util.Scanner;

public class Lesson_2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scannerArr = new Scanner(System.in);
        Scanner scannerArrB = new Scanner(System.in);
        int c;

        System.out.println("Введите длину первого массива: ");
        int a = scanner1.nextInt();
        System.out.println("Введите длину второго массива: ");
        int b = scanner2.nextInt();
        try {
            if (a != b)
                throw new RuntimeException("Массивы не равны");
        }catch (RuntimeException e){
            System.out.println(e);
        }
        int[] ArrA = new int[a];
        int[] ArrB = new int[b];

        for (int i = 0; i < a; i++) {
            try {
                ArrA[i] = scannerArr.nextInt();
            }catch (NumberFormatException e){
                System.out.println("Невозможно преобразовать букву в цифру");
                i--;
            }
        }
        for (int j = 0; j < b; j++) {
            try {
                ArrB[j] = scannerArrB.nextInt();
            }catch (NumberFormatException e){
                System.out.println("Невозможно преобразовать букву в цифру");
                j--;
            }
        }
    }

}

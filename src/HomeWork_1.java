public class HomeWork_1 {
    public static int[] Array(int[] mas1, int[] mas2) throws Exception{
        int[] mas3 = new int[mas1.length];
        if (mas1.length != mas2.length) throw new Exception("Длины массивов не равны");
        for (int i = 0; i < mas1.length; i++) {
                mas3[i] = mas1[i]-mas2[i];
                System.out.print(mas3[i]+" ");
            }return mas3;
    };

    public static int[] Array2(int[] mas1, int[] mas2) throws Exception{
        int[] mas3 = new int[mas1.length];
        if (mas1.length != mas2.length) throw new Exception("Длины массивов не равны");
        for (int i = 0; i < mas1.length; i++) {
            mas3[i] = mas1[i]/mas2[i];
            System.out.print(mas3[i]+" ");
        }return mas3;
    };

    public static void main(String[] args) {
        int[] Arr = new int[3];
        try {
            Arr[0] = 1;
            Arr[1] = 0;
            Arr[2] = Arr[0]/Arr[1];
            Arr[3] = Integer.parseInt("hello");
            Arr[4] = 3;
        }catch (ArithmeticException e) {
            System.out.println("Нельзя делить на ноль");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за пределы массива");
        }catch (NumberFormatException e){
            System.out.println("Нельзя преобразовать строку в число!");
        }

        try {
            HomeWork_1.Array(new  int[] {1,2,5}, new int[] {8,7,4});
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        try {
            HomeWork_1.Array2(new  int[] {1,2,5}, new int[] {8,7,4});
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

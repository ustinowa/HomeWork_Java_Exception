import java.io.*;
import java.util.Scanner;

public class HomeWork_3 {
    static class NoFamilyException extends Exception{
        public NoFamilyException(String errorMessage){
            super(errorMessage);
        }
    }
    static class NoNameException extends Exception{
        public NoNameException(String errorMessage){
            super(errorMessage);
        }
    }
    static class NoPatrException extends Exception{
        public NoPatrException(String errorMessage){
            super(errorMessage);
        }
    }
    static class NoDateException extends Exception{
        public NoDateException(String errorMessage){
            super(errorMessage);
        }
    }
    static class NoPhoneException extends Exception{
        public NoPhoneException(String errorMessage){
            super(errorMessage);
        }
    }
    static class NoGenderException extends Exception{
        public NoGenderException(String errorMessage){
            super(errorMessage);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Фамилию, имя, отчество, дату рождения, телефон, пол");
        String[] str = scanner.nextLine().split(" ");
        try {
            if (str.length!=6) throw new Exception("Вы ввели меньше или больше данных, чем требовалось!");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            if (str[0].matches("\\d*")) throw new NoFamilyException("Фамилия не может содержать цифры");
            if (str[1].matches("\\d*")) throw new NoNameException("Имя не может содержать цифры");
            if (str[2].matches("\\d*")) throw new NoPatrException("Отчество не может содержать цифры");
            if (!str[3].matches("\\d{2}+\\.\\d{2}+\\.\\d{4}")) throw new NoDateException("Неверный формат даты");
            if (!str[4].matches("^[0-9]+$")) throw new NoPhoneException ("Неверный формат номера телефона");
            if (!(str[5].equals("f")||str[5].equals("m"))) throw new NoGenderException ("При вводе пола нужно указать f или m");


        }catch (NoFamilyException e){
            System.out.println(e);
        }catch (NoNameException e1){
            System.out.println(e1);
        }catch (NoPatrException e2){
            System.out.println(e2);
        }catch (NoDateException e3){
            System.out.println(e3);
        }catch (NoPhoneException e4){
            System.out.println(e4);
        }catch (NoGenderException e5){
            System.out.println(e5);
        }
        File f = new File(str[0]);
        if (f.isFile()){
            try {
                FileWriter writer = new FileWriter(f, true);
                BufferedWriter bufferWriter = new BufferedWriter(writer);
                for (int i = 0; i < str.length; i++) {
                    bufferWriter.write(str[i]+" ");
                }
                bufferWriter.write("\n");
                bufferWriter.close();
            }catch (RuntimeException|IOException e){
                System.out.println("Ошибка: "+e.getClass().getSimpleName());
            }
        }else {
            try (FileWriter writer = new FileWriter(str[0])){
                for (int i = 0; i < str.length; i++) {
                    writer.write(str[i]+" ");
                }
                writer.write("\n");

            }catch (RuntimeException|IOException e){
                System.out.println("Ошибка: "+e.getClass().getSimpleName());
            }
        }
    }
}

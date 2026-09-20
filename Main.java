import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Названия: int");
        System.out.println("Рaзмер: " + Integer.BYTES);
        System.out.println("Минимум: " + Integer.MIN_VALUE);
        System.out.println("Максимум: " + Integer.MAX_VALUE);

        System.out.println("Названия: double");
        System.out.println("Рaзмер: " + Double.BYTES);
        System.out.println("Минимум: " + Double.MIN_VALUE);
        System.out.println("Максимум: " + Double.MAX_VALUE);

        System.out.println("Названия: long");
        System.out.println("Рaзмер: " + Long.BYTES);
        System.out.println("Минимум: " + Long.MIN_VALUE);
        System.out.println("Максимум: " + Long.MAX_VALUE);

        System.out.println("Названия: short");
        System.out.println("Рaзмер: " + Short.BYTES);
        System.out.println("Минимум: " + Short.MIN_VALUE);
        System.out.println("Максимум: " + Short.MAX_VALUE);

        System.out.println("Названия: byte");
        System.out.println("Рaзмер: " + Byte.BYTES);
        System.out.println("Минимум: " + Byte.MIN_VALUE);
        System.out.println("Максимум: " + Byte.MAX_VALUE);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        String input1 = scanner.nextLine();
        int number = Integer.parseInt(input1);
        System.out.println("Вы ввели:" + number);

        System.out.println("Введите дробное число: ");
        String input2 = scanner.nextLine();
        double d = Double.parseDouble(input2);
        System.out.println("Вы ввели:" + d);

        System.out.println("Введите большое число: ");
        String input3 = scanner.nextLine();
        long l = Long.parseLong(input3);
        System.out.println("Вы ввели:" + l);

        System.out.println("Введите true или false: ");
        String input4 = scanner.nextLine();
        boolean b = Boolean.parseBoolean(input4);
        System.out.println("Вы ввели:" + b);
    }
}
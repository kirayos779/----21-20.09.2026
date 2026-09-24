import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("Введите дробное число: ");
        double fraction = Double.parseDouble(scanner.nextLine());

        System.out.println("Введите текст: ");
        String text = scanner.nextLine();

        System.out.println("Введите true или false: ");
        boolean flag = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("1)" + number + " " + fraction + " " + text + " " + flag);
        System.out.printf("2) %d %f %s %b%n", number, fraction, text, flag);

        String result3 = String.format("3) %d %.2f %s %b", number, fraction, text, flag);
        System.out.println(result3);

        System.out.printf("4) десятичное: %d%n", number );
        System.out.printf("5) шестнадцатеричное: %x%n", number );
        System.out.printf("6) восьмеричное: %o%n", number );
        System.out.printf("7) дробное(1 знак после комы): %.1f%n", fraction );
        System.out.printf("8) дробное(3 знак после комы): %.3f%n", fraction );
        System.out.printf("9) строка шириной 15: [%15s]%n", text );
        System.out.printf("9) первые 3 символа строки: [%.3s]%n", text );
    }
}


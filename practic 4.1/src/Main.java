import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); 

        System.out.print("Введіть сторону a: ");
        double a = sc.nextDouble();
        System.out.print("Введіть сторону b: ");
        double b = sc.nextDouble();
        System.out.print("Введіть сторону c: ");
        double c = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Сторони мають бути більшими за нуль.");
        } else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Трикутник існує.");
            if (a == b && a == c) {
                System.out.println("Вид: рівносторонній");
            } else if (a == b || a == c || b == c) {
                System.out.println("Вид: рівнобедрений");
            } else {
                System.out.println("Вид: різнобічний");
            }
        } else {
            System.out.println("Такого трикутника не існує.");
        }

        sc.close();
    }
}

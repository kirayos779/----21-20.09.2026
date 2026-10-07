import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = sc.nextInt();

        System.out.print("Простые числа от 1 до " + n + ":");
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int d = 1; d <= num; d++) {
                if (num % d == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
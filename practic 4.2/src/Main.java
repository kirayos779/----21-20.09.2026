import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть текст: ");
        String text = sc.nextLine();

        int count = 0;
        int i = 0;
        while (i < text.length()) {
            char ch = text.charAt(i);
            if (ch == '.' || ch == ' ! ' || ch == '?') {
                count++;

                while (i + 1 < text.length() && isEnd(text.charAt(i + 1))) {
                    i++;
                }
            }
            i++;
        }

        System.out.println("Кількість речень: " + count);
        sc.close();
    }

    private static boolean isEnd(char ch) {
        return ch == '.' || ch == '!' || ch == '?';
    }
}

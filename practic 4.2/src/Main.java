import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = sc.nextLine();

        int countWhile = 0;
        int i = 0;
        while (i < text.length()) {
            char ch = text.charAt(i);
            if (ch == '.' || ch == '!' || ch == '?') {
                countWhile++;
                while (i+1 < text.length() && (text.charAt(i+1) == '.' ||  text.charAt(i+1) == '!' ||  text.charAt(i+1) == '?')) {
                    i++;
                }
            }
            i++;
        }
        System.out.println("Кількість речень: " + countWhile);
        sc.close();
    }
}
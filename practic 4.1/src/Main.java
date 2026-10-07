import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите сторону a:");
        double a = sc.nextDouble();
        System.out.print("Введите сторону b:");
        double b = sc.nextDouble();
        System.out.print("Введите сторону c:");
        double c = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Стороны должны быть больше нуля.");
        } else if  (a+b > c && a+c > b && b+c > a) {
            System.out.println("Треугольник существует.");
            if (a ==b && a ==c){
                System.out.println("равносторонний треугольник");
            } else if  (a == b || a == c || b == c){
                System.out.println("равнобедреный треугольник");
            } else {
                System.out.println("разносторонний треугольник");
            }
        }  else {
            System.out.println("такого треугольник не существует");
        }
        sc.close();
    }
}
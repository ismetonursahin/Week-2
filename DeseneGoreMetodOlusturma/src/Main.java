import java.awt.*;
import java.util.Scanner;

public class Main {
    static void drawing(int n) {
        int temp = n;
        System.out.print(n + " ");

        for (int i = -5; i < n; i++) {
            n -= 5;
            System.out.print(n + " ");
            if (n == 0) {
                break;
            }
        }

        for (int i = n; i <= temp; i++) {
            n += 5;
            System.out.print(n + " ");
            if (n == temp) {
                System.out.println();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        drawing(number);
    }
}
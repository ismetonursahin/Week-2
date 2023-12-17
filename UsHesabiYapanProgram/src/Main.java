import com.sun.security.jgss.GSSUtil;

import java.awt.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static int exp(int a, int b) {
        if(a == 0 && b!= 0){
            System.out.println("Sonuç : " +0);
            return 0;
        }
        if(b == 0){
            System.out.println("Sonuç : " + 1);
            return  1;
        }

        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Sonuç : " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" ******* Üs Hesabı Yapan Program *******");
        int num1, num2;

        System.out.print("İlk Sayıyı Giriniz : ");
        num1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        num2 = input.nextInt();

        exp(num1, num2);
    }
}
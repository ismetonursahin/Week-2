import com.sun.security.jgss.GSSUtil;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class GelismisHesapMakinesi {

    static int plus(int a, int b) {
        int result = a + b;
        System.out.println("Toplama Sonucu : " + result);
        return result;
    }

    static int sub(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma İşlemi : " + result);
        return result;
    }

    static int multi(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma İşlemi : " + result);
        return result;
    }

    static int divid(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("Bölme İşlemi : " + 0);
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme İşlemi : " + result);
        return result;
    }

    static int exp(int a, int b) {
        if (a == 0) {
            System.out.println("Sonuç : " + 0);
            return 0;
        } else if (b == 0) {
            System.out.println("Sonuç : " + 1);
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üs İşlemi : " + result);
        return result;
    }

    static int mod(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("Mod İşlemi : " + 0);
            return 0;
        }

        int result = a % b;
        System.out.println("Mod İşlemi : " + result);
        return result;
    }

    static int factoriyel(int a) {
        if (a == 0 || a == 1) {
            System.out.println("Faktöriyel Sonucu : " + 1);
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Faktöriyel Sonucu : " + result);
        return result;
    }

    static int areaAndPerimt(int a, int b) {
        int perimeter = 2 * (a + b);
        System.out.println("Çevre : " + perimeter);
        int area = a * b;
        System.out.println("Alan : " + area);
        return perimeter + area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;
        int a, b, fac;
        String menu = "\n1- Toplama İşlemi" +
                "\n2- Çıkarma İşlemi " +
                "\n3- Çarpma İşlemi" +
                "\n4- Bölme İşlemi" +
                "\n5- Üslü Sayı Hesaplama" +
                "\n6- Mod Alma " +
                "\n7- Dikdörtgen Alan ve Çevre Hesabı" +
                "\n8- Faktoriyel Hesaplama " +
                "\n0- Çıkış Yap";

            System.out.println(menu);
        while (true) {
            System.out.print("Hangi İşlemi Yapmak İstiyorsunuz : ");
            select = input.nextInt();

            if (select == 0) {
                break;
            }
            if (select == 8) {
                System.out.print("Faktöriyel Sayısı : ");
                fac = input.nextInt();
                factoriyel(fac);

            } else {

                System.out.print("İlk Sayıyı Yaz : ");
                a = input.nextInt();
                System.out.print("İkinci Sayıyı Yaz : ");
                b = input.nextInt();

                switch (select) {
                    case 1:
                        plus(a, b);
                        break;
                    case 2:
                        sub(a, b);
                        break;
                    case 3:
                        multi(a, b);
                        break;
                    case 4:
                        divid(a, b);
                        break;
                    case 5:
                        exp(a, b);
                        break;
                    case 6:
                        mod(a, b);
                        break;
                    case 7:
                        areaAndPerimt(a, b);
                        break;
                    default:
                        System.out.println("Geçersiz Bir Değer Girdiniz.");
                }

            }
        }
        System.out.println("Güle Güle");

    }
}
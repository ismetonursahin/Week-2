import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin: ");
        int sayi = scanner.nextInt();
        boolean durum = false;
        func(sayi,sayi,durum);
        scanner.close();
    }

    public static void func(int sayi,int basla,boolean durum) {
        System.out.print(sayi +" ");
        if(sayi <= 0){
            func(sayi + 5, basla ,true);
        }
        else if(sayi > 0 && !durum){
            func(sayi - 5,basla, false);
        }
        else if(sayi > 0 && durum && basla!=sayi){
            func(sayi+5 ,basla , true );
        }
    }
}

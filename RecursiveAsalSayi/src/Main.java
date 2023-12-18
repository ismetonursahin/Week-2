import java.awt.*;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {
     static void function(int sayi){
          int bolenSayi = 0;
          for(int i = 2 ; i<=10;i++){
              if(sayi % i == 0){ //2 den fazla bölen varsa o sayı asal değildir.
                  bolenSayi++;
              }
          }
          if(bolenSayi>=2){
             System.out.println(sayi + " : Bu Sayı Asal Değil");
          }else {
              System.out.println(sayi + " : Bu Sayı Asal");
          }
     }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number ;
        System.out.print("Bir Sayı Giriniz : ");
        number = input.nextInt();

        function(number);

    }
}
import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Satır Sayısı Giriniz : ");
        int x = input.nextInt();                       // Matrisin Satır ve sütun sayısını kullanıcıdan alıyoruz.
        System.out.print("Sütun Sayısı Giriniz : ");
        int y = input.nextInt();

        int[][] matris = new int[x][y];
        int[][] matrisTranspoze = new int[y][x];
        System.out.println(" --  MATRİS  -- ");

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {  // Matris içerisinde rastgele sayılar yazdırıyoruz.
                matris[i][j] = (int) (Math.random() * 10);
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" --  MATRİS TRANSPOZU  -- ");

        for (int i = 0; i < matrisTranspoze.length; i++) {
            for (int j = 0; j < matrisTranspoze[i].length; j++) { // yukarıda oluşturulan matrisin transpozu (devriğini)
                matrisTranspoze[i][j] = matris[j][i];             // burada alıyoruz.
                System.out.print(matrisTranspoze[i][j] + " ");
            }
            System.out.println();
        }
    }
}

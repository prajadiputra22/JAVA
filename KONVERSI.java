
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TOSHIBA
 */
import java.util.Scanner;
public class KONVERSI {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;

        System.out.print("Masukkan nilai Anda: ");
        nilai = input.nextInt();

        if (nilai >= 85 && nilai <= 100) {
            System.out.println("Nilai Anda adalah A");
        } else if (nilai >= 75 && nilai <= 84) {
            System.out.println("Nilai Anda adalah B");
        } else if (nilai >= 65 && nilai <= 74) {
            System.out.println("Nilai Anda adalah C");
        } else if (nilai >= 55 && nilai <= 64) {
            System.out.println("Nilai Anda adalah D");
        } else {
            System.out.println("Nilai Anda adalah E");
        }

        input.close();
    }

}


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
public class ARITMATIKA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input bilangan 1 : ");
        double bil1 = input.nextDouble();

        System.out.print("Input bilangan 2 : ");
        double bil2 = input.nextDouble();

        System.out.print("Input Operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        double hasil = 0.0;

        switch (operator) {
            case '+':
                hasil = bil1 + bil2;
                System.out.printf("Hasil penjumlahan %.2f dan %.2f adalah %.2f", bil1, bil2, hasil);
                break;
            case '-':
                hasil = bil1 - bil2;
                System.out.printf("Hasil pengurangan %.2f dan %.2f adalah %.2f", bil1, bil2, hasil);
                break;
            case '*':
                hasil = bil1 * bil2;
                System.out.printf("Hasil perkalian %.2f dan %.2f adalah %.2f", bil1, bil2, hasil);
                break;
            case '/':
                hasil = bil1 / bil2;
                System.out.printf("Hasil pembagian %.2f dan %.2f adalah %.2f", bil1, bil2, hasil);
                break;
            case '%':
                hasil = bil1 % bil2;
                System.out.printf("Hasil modulus %.2f dan %.2f adalah %.2f", bil1, bil2, hasil);
                break;
            default:
                System.out.println("Operator yang anda masukkan salah.");
                break;
        }

        input.close();
    }
}

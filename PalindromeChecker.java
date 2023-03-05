
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
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=======PalindromeChecker=======");
        System.out.println("===Darmawan Suka Prajadiputra==="); 
        System.out.print("Masukkan sebuah kata: ");
        String kata = input.nextLine().toLowerCase();

        if (isPalindrome(kata)) {
            System.out.println(kata + " adalah palindrome.");
        } else {
            System.out.println(kata + " bukan palindrome.");
        }

        input.close();
    }

    public static boolean isPalindrome(String kata) {
        int panjang = kata.length();
        for (int i = 0; i < panjang/2; i++) {
            if (kata.charAt(i) != kata.charAt(panjang-1-i)) {
                return false;
            }
        }
        return true;
    }
}


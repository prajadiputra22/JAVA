
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
public class PalindromeNumber {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int num = input.nextInt();
        int nextNum = num + 1;
        
        while (!isPalindrome(nextNum)) {
            nextNum++;
        }
        
        System.out.println("Angka palindrome terdekat selanjutnya adalah " + nextNum);
    }
    
    public static boolean isPalindrome(int num) {
        String strNum = Integer.toString(num);
        int len = strNum.length();
        
        for (int i = 0; i < len/2; i++) {
            if (strNum.charAt(i) != strNum.charAt(len - i - 1)) {
                return false;
            }
        }
        
        return true;
    }
}

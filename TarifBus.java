
import java.util.ArrayList;
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
public class TarifBus {
    
    public static void main(String[] args) {
        ArrayList<String> jalurOperasional = new ArrayList<>();
        jalurOperasional.add("Sukabumi");
        jalurOperasional.add("Cianjur");
        jalurOperasional.add("Bandung");
        jalurOperasional.add("Garut");
        jalurOperasional.add("Tasik");
        jalurOperasional.add("Ciamis");
        jalurOperasional.add("Banjar");
        
        ArrayList<Integer> tarif = new ArrayList<>();
        tarif.add(10000);
        tarif.add(15000);
        tarif.add(7500);
        tarif.add(5000);
        tarif.add(7500);
        tarif.add(6000);

        Scanner input = new Scanner(System.in);
        System.out.println("Jalur Bus: " + jalurOperasional);

        System.out.print("Kota Keberangkatan: ");
        String kotaAsal = input.nextLine();
        if (!jalurOperasional.contains(kotaAsal)) {
            System.out.println("Kota Keberangkatan Tidak Valid");
            return;
        }

        System.out.print("Kota Tujuan: ");
        String kotaTujuan = input.nextLine();
        if (!jalurOperasional.contains(kotaTujuan)) {
            System.out.println("Kota Tujuan Tidak Valid");
            return;
        }

        int indexAsal = jalurOperasional.indexOf(kotaAsal);
        int indexTujuan = jalurOperasional.indexOf(kotaTujuan);

        boolean pp = false;
        if (indexAsal > indexTujuan) {
            int temp = indexAsal;
            indexAsal = indexTujuan;
            indexTujuan = temp;
            pp = true;
        }

        int totalTarif = 0;
        for (int i = indexAsal; i < indexTujuan; i++) {
            totalTarif += tarif.get(i);
        }

        if ((kotaAsal.equals("Sukabumi") && kotaTujuan.equals("Banjar")) ||
                (kotaAsal.equals("Banjar") && kotaTujuan.equals("Sukabumi"))) {
            totalTarif *= 0.95; // diskon 5%
        }

        System.out.print("Apakah penumpang termasuk anggota TNI/POLRI (y/n)? ");
        String isTNI = input.nextLine();
        if (isTNI.equals("y")) {
            totalTarif *= 0.9; // diskon 10%
        }

        if (pp) {
            totalTarif *= 2;
        }

        System.out.println("Total Tarif: Rp " + totalTarif);
    }
}
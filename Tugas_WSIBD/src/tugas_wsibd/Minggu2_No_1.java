package Tugas_WSIBD;
import java.util.Scanner;
public class Minggu2_No_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--------------------------------------------------------");
        System.out.println("          Kharisma Agung Plaza < KAP >");
        System.out.println("            Promo Belanja Berhadiah");
        System.out.println("       Khusus Pembelian 5 Barang Pertama");
        System.out.println("        Dengan harga minimum Rp 10000,00");
        System.out.println("--------------------------------------------------------");
        
        System.out.print("Masukkan nama pembeli : ");
        String nama = scanner.nextLine();
        
        int totalHarga = 0;
        int[] hargaBarang = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan harga barang ke-" + (i + 1) + " : ");
            hargaBarang[i] = scanner.nextInt();
            totalHarga += hargaBarang[i];
        }
        System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp " + totalHarga);
        
        if (totalHarga >= 10000) {
            System.out.println("\nSelamat....");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        } else {
            System.out.println("\nmohon maaf");
            System.out.println("Anda tidak mendapat hadiah 1 buah mug cantik");
            
        System.out.println("--------------------------------------------------------");
        System.out.println("                 Terima Kasih");
        System.out.println("  Anda sudah belanja di Kharisma Agung Plaza");
        System.out.println("--------------------------------------------------------");   
        }
    }
}

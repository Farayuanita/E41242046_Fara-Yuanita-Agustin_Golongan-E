import java.util.Random;
import java.util.Scanner;
public class minggu3_p3_tugas_no2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rndm = new Random();
        int baris;
        int kolom;
        
        System.out.print("masukkan jumlah baris: ");
        baris = scan.nextInt();
        
        System.out.print("masukkan jumlah kolom: ");
        kolom = scan.nextInt();
        
        int[][] no = new int[baris][kolom];
        
        for (int i =0; i<baris; i++){
            for (int j = 0; j<kolom; j++){
                no[i][j] = rndm.nextInt(50);
            }
        }
        System.out.println("\nArray dua dimensi acak yang dihasilkan: ");
        for (int i = 0; i<baris; i++){
            for (int j = 0; j<kolom; j++){
                System.out.print(no[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}

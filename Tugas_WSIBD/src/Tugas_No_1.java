import java.util.Scanner;

public class Tugas_No_1 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas awal: ");
        int awal = scanner.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int akhir = scanner.nextInt();
        System.out.println("Bilangan genap dari " + awal + " sampai " + akhir + " :");

        if (awal % 2 != 0) {
            awal++; 
        }
        for (int i = awal; i <= akhir; i += 2) {
            System.out.print(i + " ");
        }
    }
}


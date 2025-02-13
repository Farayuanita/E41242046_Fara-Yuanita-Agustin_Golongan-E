package Tugas_WSIBD;

import java.util.Scanner;

public class Acara7_No_1 {
    public static void main(String[] args) {
        
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Inputkan nilai: ");
        nilai = scan.nextInt();
        
        if (nilai >= 92 && nilai <= 100) {
            grade = "A";    
        } else if (nilai >= 83) {
            grade = "B+";
        } else if (nilai >= 78) {
            grade = "B";
        } else if (nilai >= 68) {
            grade = "C+";
        } else if (nilai >= 50) {
            grade = "C";
        } else if (nilai >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }
       
        System.out.println("Grade: " + grade);
    }
}

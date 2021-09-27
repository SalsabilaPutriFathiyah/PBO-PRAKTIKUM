package tugas1.javat;

import java.util.Scanner;

public class Tugas1JavaT {

    public static void main(String[] args) {
        String nama, kelas;
        int nilaiTugas, nilaiUTS, nilaiUAS;
        double nilaiAkhir;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("### Pendataan Grade Siswa ###");
        System.out.print("Nama Siswa : ");
        nama = keyboard.nextLine();
        System.out.print("Kelas : ");
        kelas = keyboard.nextLine();
        System.out.print("Nilai Tugas : ");
        nilaiTugas = keyboard.nextInt();
        System.out.print("Nilai UTS : ");
        nilaiUTS = keyboard.nextInt();
        System.out.print("Nilai UAS : ");
        nilaiUAS = keyboard.nextInt();
        
        nilaiAkhir = (0.2 * nilaiTugas) + (0.35 * nilaiUTS) + (0.45 * nilaiUAS);
        
        if (nilaiAkhir >= 85){
            System.out.println("Nilai Akhir : A");
        }else if (nilaiAkhir < 85 && nilaiAkhir >= 75 ){
            System.out.println("Nilai Akhir : B");
        }else if (nilaiAkhir < 75 && nilaiAkhir >= 65 ){
            System.out.println("Nilai Akhir : C");
        }else if (nilaiAkhir < 65 && nilaiAkhir >= 50 ){
            System.out.println("Nilai Akhir : D");
        }else if (nilaiAkhir < 50){
            System.out.println("Nilai Akhir : E");
        }else{
            System.out.println("Error");
        }
    }
    
}

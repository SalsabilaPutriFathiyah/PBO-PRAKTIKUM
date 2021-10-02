package inputOutput;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int gajiPokok = 500000;
        int x = input.nextInt();
        int penghasilan, totalPenjualan, hargaPerItem = 50000;
        
        if (x > 80){
            totalPenjualan = x * hargaPerItem;
            penghasilan = gajiPokok + (int)(totalPenjualan * 0.35);
        }else if (x >= 40){
            totalPenjualan = x * hargaPerItem;
            penghasilan = gajiPokok + (int)(totalPenjualan * 0.25);
        }else if (x < 15){
            x = 15 - x;
            totalPenjualan = x * hargaPerItem;
            penghasilan = gajiPokok - (int)(totalPenjualan * 0.15);
        }else{
            totalPenjualan = x * (int)(0.1 * hargaPerItem);
            penghasilan = gajiPokok + totalPenjualan;   
        }
        
        System.out.println(penghasilan);

    }
}

package inputOutput;

import java.util.*;

public class Soal6 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            String a = input.nextLine();
            String b = input.nextLine();
                        
            if (a.length() <= 200 && b.length() <=200){
                var x = Long.parseLong(a);
                var y = Long.parseLong(b);
                if (x > 0 && y > 0){
                    long penjumlahan = x + y;
                    long perkalian = x * y;
                    System.out.println(penjumlahan);
                    System.out.println(perkalian);
                }
                
            }
            
            
    }
}

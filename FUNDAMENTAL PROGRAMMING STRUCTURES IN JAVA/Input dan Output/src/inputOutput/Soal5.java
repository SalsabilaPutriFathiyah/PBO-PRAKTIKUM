package inputOutput;

import java.util.*;

public class Soal5 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            String mobil1 = input.next();
            String mobil2 = input.next();
            String mobil3 = input.next();
            String mobil4 = input.next();
            
            String plat = mobil1 + mobil2 + mobil3 + mobil4;
            
            var x = Long.parseLong(plat);
            
            if (0 == ((x - 999999) % 5)){
                System.out.println("jalan");
            }else{
                System.out.println("berhenti");
            }
    }
}

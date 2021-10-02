package inputOutput;

import java.util.*;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        input.close();
       
        /*  Metode string split() memecah string tertentu 
            di sekitar kecocokan ekspresi reguler yang diberikan. 
            Setelah membelah terhadap ekspresi reguler yang diberikan, 
            metode ini mengembalikan array char.*/
        String[] kalimat = s.split("['!?,._@ ]+");
        System.out.println(kalimat.length);
        for (String str : kalimat)
            System.out.println(str);
        
    }
}

package inputOutput;

import java.util.*;

public class Soal3 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("===========================");
            for(int i=0;i<5;i++)
            {
                int A = input.nextInt();
                String operator = input.next();
                int B = input.nextInt();
                int C = 0 ;
                if ("+".equals(operator)){
                    C = A + B;
                }
                if ("-".equals(operator)){
                    C = A - B;
                }
                if ("*".equals(operator)){
                    C = A * B;
                }
                if ("/".equals(operator)){
                    C = A / B;
                }
                if ("%".equals(operator)){
                    C = A % B;
                }
                System.out.println(C);  
            }
            System.out.println("===========================");

    }
}

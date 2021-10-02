package inputOutput;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("===========================");
            for(int i=0;i<3;i++)
            {
                String s = input.next();
                int x = input.nextInt();
                System.out.printf("%-8s%03d%n", s, x);
            }
            System.out.println("===========================");

    }
}

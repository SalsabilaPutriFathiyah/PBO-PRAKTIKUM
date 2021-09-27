import java.util.*;
import java.io.*;

public class nmr1 {
    public static void main(String []argh)
    {
        // Membuat scanner baru(inputan)
        Scanner input = new Scanner(System.in);
        // Untuk mengambil data yang bertipe integer menggunakan nextInt()
        int t=input.nextInt();
        for(int i=0;i<t;i++)
        {
            // untuk mengecek apakah ada kesalahan pada program, 
            //dan apabila terdapat kesalahan maka akan dilempar pada catch
            try
            {
                long N=input.nextLong();
                System.out.println(N+" can be fitted in:");
                if(N>=-128 && N<=127)System.out.println("* byte");
                if (N>=-32768 && N<=32767)System.out.println("* short");
                if (N>=-2147483648 && N<=2147483647)System.out.println("* int");
                if (N>=-9223372036854775808L && N<=9223372036854775807L)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(input.next()+" can't be fitted anywhere.");
            }

        }
    }
}

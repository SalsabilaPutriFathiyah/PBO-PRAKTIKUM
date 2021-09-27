/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal5;

import java.io.*;
import java.util.*;

public class Soal5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        
        System.out.println(a.length()+b.length());
        System.out.println( a.compareTo(b)>0 ? "Yes" : "No" );
        System.out.println( a.substring(0,1).toUpperCase()+a.substring(1,a.length())+" "+b.substring(0,1).toUpperCase()+b.substring(1,b.length()) );
        
    }
    
}

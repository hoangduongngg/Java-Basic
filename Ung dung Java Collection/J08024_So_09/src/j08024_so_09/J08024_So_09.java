/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j08024_so_09;

import java.util.*;

/**
 *
 * @author hoangduongngg
 */
public class J08024_So_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();
        while (t-->0) {
            int n = in.nextInt();
            System.out.println(So_09(n));
        }
    }
    
    public static long So_09 (int n) {
        Queue <Integer> Q = new LinkedList<>();
        Q.add(9);
        while (true) {
            Integer x = Q.peek(); 
            Q.poll();
            if (x%n==0) return x;
            Q.add(x * 10);
            Q.add(x * 10 + 9);
        }
    }
    
}

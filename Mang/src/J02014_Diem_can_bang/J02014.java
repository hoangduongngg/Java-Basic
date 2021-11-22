/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02014_Diem_can_bang;

import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J02014 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        byte t = in.nextByte();
        while (t-->0) {
            int n = in.nextInt();
            int[] a = new int [n+5];
            for (int i=1; i<=n; i++) {
                a[i] = in.nextInt();
            }
            System.out.println(Diem_can_bang.Index(a, n));
        }
    }
}

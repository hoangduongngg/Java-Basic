/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3_So_uu_the;

import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t= in.nextInt();
        while (t-->0) {
            String n = in.next();
            if (So_uu_the.Check(n)==0) System.out.println("INVALID");
            else if (So_uu_the.Check(n)==1) System.out.println("YES");//so uu the
            else System.out.println("NO");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4_So_La_Ma;

import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0) {
            String s = in.next();
            System.out.println(So_La_Ma.ChuyenDoi(s));
        }
    }
}

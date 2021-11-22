/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1_Cat_doi;

import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class Bai1 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();
        while (t-->0) {
            String n = in.next();
            Cat_doi.Do(n);
        }
    }
}

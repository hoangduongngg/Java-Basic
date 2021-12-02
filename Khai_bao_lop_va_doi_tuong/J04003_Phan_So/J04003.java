/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04003_Phan_So;

import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J04003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PhanSo p = new PhanSo(in.nextLong(), in.nextLong());
        p.rutgon();
        System.out.println(p);     
    }
    
}

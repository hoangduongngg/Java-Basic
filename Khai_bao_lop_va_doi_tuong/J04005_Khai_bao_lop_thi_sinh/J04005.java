/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04005_Khai_bao_lop_thi_sinh;

import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J04005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Thi_Sinh a = new Thi_Sinh(in.nextLine(), in.nextLine(), in.nextFloat(), in.nextFloat(), in.nextFloat());
        System.out.println(a);
    }
}

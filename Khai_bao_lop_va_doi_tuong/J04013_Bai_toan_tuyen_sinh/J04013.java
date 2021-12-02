/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04013_Bai_toan_tuyen_sinh;

import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J04013 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Thi_sinh a = new Thi_sinh(in.nextLine(), in.nextLine(), in.nextDouble(), in.nextDouble(), in.nextDouble() );
        System.out.println(a);
    }
}

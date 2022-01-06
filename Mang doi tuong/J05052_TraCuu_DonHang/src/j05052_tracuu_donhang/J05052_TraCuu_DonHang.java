/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05052_tracuu_donhang;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J05052_TraCuu_DonHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<DonHang> dsdh = new ArrayList<>();
        while (t-->0) {
            dsdh.add(new DonHang(in.nextLine(), in.nextLine(),in.nextLine(),in.nextLine()));
        }
        
        for (DonHang x :dsdh) {
            System.out.println(x);
        }
    }
    
}
//3
//Kaki 2
//K0252
//80000
//15
//Jean 1
//J2011
//200000
//24
//Jean 2
//J0982
//150000
//12

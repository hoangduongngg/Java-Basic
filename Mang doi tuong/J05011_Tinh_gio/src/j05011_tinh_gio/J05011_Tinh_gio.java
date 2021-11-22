/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05011_tinh_gio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J05011_Tinh_gio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        ArrayList <NguoiChoi> ds = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while (t-->0) {
            NguoiChoi player = new NguoiChoi (in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            ds.add(player);
        }
        Collections.sort(ds);
        for (Object xObject:ds){
            System.out.println(xObject);
        }
    }   
    
}

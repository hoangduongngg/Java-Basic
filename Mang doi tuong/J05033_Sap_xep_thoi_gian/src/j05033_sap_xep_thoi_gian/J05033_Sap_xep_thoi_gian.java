/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05033_sap_xep_thoi_gian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J05033_Sap_xep_thoi_gian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <ThoiGian> ds_time = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-->0) {
            ds_time.add(new ThoiGian(in.nextLine()));
        }
        Collections.sort(ds_time);
        for (Object xObject:ds_time) {
            System.out.println(xObject);
        }
    }
    
}
//3
//11 20 20
//14 20 14
//11 15 12

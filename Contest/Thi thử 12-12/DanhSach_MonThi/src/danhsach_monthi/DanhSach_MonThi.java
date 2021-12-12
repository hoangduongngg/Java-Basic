/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsach_monthi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class DanhSach_MonThi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> ds_mh = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while (t-->0) {
            MonHoc mh = new MonHoc(in.nextLine(),in.nextLine(),in.nextLine());
            ds_mh.add(mh);
        }
        Collections.sort(ds_mh);
        for (Object xObject:ds_mh) {
            System.out.println(xObject);
        }
        
    }
    
}

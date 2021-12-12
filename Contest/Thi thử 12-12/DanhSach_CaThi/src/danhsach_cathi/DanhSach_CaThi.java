/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsach_cathi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class DanhSach_CaThi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("CATHI.in"));
        ArrayList<CaThi> ds_ct = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        int stt = 0;
        while (t-->0) {
            stt++;
            CaThi ct = new CaThi(stt, in.nextLine(),in.nextLine(),in.nextLine());
            ds_ct.add(ct);
        }
        Collections.sort(ds_ct);
        for (Object xObject:ds_ct) {
            System.out.println(xObject);
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dky_hinhthuc;

import java.io.*;
import java.util.*;

/**
 *
 * @author hoangduongngg
 */
public class Dky_hinhthuc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList <MonHoc> dsmh = new ArrayList<>();
        while (t-->0) {
            dsmh.add(new MonHoc(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        Collections.sort(dsmh);
        for (MonHoc mh:dsmh) {
            if (mh.getHinhThucTH().compareTo("Truc tiep")!=0) {
                System.out.println(mh);
            }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuanhoa_sapxep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class ChuanHoa_sapxep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DANHSACH.in"));
        ArrayList <DanhSach> ds = new ArrayList<>();
        while (in.hasNextLine()) {
            ds.add(new DanhSach(in.nextLine()));
        }
        Collections.sort(ds);
        for (DanhSach x :ds) {
            System.out.println(x);
        }
    }
    
}

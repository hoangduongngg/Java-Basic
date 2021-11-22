/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_sv;

import java.util.*;
import java.io.*;

/**
 *
 * @author hoangduongngg
 */
public class DS_SV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(in.nextLine());
        
        HashMap <String, SinhVien> map = new HashMap<>();
        while (t-->0) {
            SinhVien sv = new SinhVien (in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            map.put(sv.getMa(), sv);
        }
        xuly(map);
    }
    public static void xuly(HashMap <String, SinhVien> map) {
        List keys = new LinkedList(map.keySet());
        Collections.sort(keys);
        
        for (Object x: keys) {
            System.out.println(map.get(x));
        }
    }
    
}

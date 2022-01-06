/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05075_diemdanh_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J05075_DiemDanh_2 {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<SinhVien> dssv = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        for (int i=0; i<t; i++) {
            dssv.add(new SinhVien(i, in.nextLine(), in.nextLine(), in.nextLine()));
        }
        
        ArrayList<DiemDanh> dsdd = new ArrayList<>();
        for (int i=0; i<t; i++) {            
            String[] str = in.nextLine().split(" ");
            for (SinhVien sv:dssv) {
                if (sv.getMaSV().compareTo(str[0])==0) {
                    dsdd.add(new DiemDanh(sv, str[1], sv.getStt()));
                    break;
                }
            }
        }
        Collections.sort(dsdd);
        
        String LopCanLK = in.nextLine();
        for (DiemDanh x:dsdd) {
            if (LopCanLK.compareTo(x.getLopSV())==0) {
               System.out.println(x);

            }
        }
        
    }
    
}
//3
//B19DCCN999
//Le Cong Minh
//D19CQAT02-B
//B19DCCN998
//Tran Truong Giang
//D19CQAT02-B
//B19DCCN997
//Nguyen Tuan Anh
//D19CQCN04-B
//B19DCCN998 xxxmxmmvmx
//B19DCCN997 xmxmxxxvxx
//B19DCCN999 xvxmxmmvvm
//D19CQAT02-B
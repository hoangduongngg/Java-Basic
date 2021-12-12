/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxep_lichthi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class SapXep_LichThi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in_mh = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> ds_mh = new ArrayList<>();
        int t_mh = Integer.parseInt(in_mh.nextLine());
        while (t_mh-->0) {
            MonHoc mh = new MonHoc(in_mh.nextLine(),in_mh.nextLine(),in_mh.nextLine());
            ds_mh.add(mh);
        }
        
        Scanner in_ct = new Scanner(new File("CATHI.in"));
        ArrayList<CaThi> ds_ct = new ArrayList<>();
        int t_ct = Integer.parseInt(in_ct.nextLine());
        int stt = 0;
        while (t_ct-->0) {
            stt++;
            CaThi ct = new CaThi(stt, in_ct.nextLine(),in_ct.nextLine(),in_ct.nextLine());
            ds_ct.add(ct);
        }
        
        Scanner in_lt = new Scanner(new File("LICHTHI.in"));
        ArrayList<LichThi> ds_lt = new ArrayList<>();
        int t_lt = Integer.parseInt(in_lt.nextLine());
        while (t_lt -->0) {
            String[] data = in_lt.nextLine().split(" ");
            String MaCaThi = data[0];
            String MaMonHoc = data[1];
            String Nhom = data[2]; String SoSinhVien = data[3];
            String NgayThi = "", GioThi= "", PhongThi= "", TenMonThi= "";
            
            for (CaThi xCaThi:ds_ct) {
                if (MaCaThi.compareTo(xCaThi.getMaCaThi())==0) {
                    NgayThi = xCaThi.getNgayThi();
                    GioThi = xCaThi.getGioThi();
                    PhongThi = xCaThi.getPhongThi();
                    break;
                }
            }
            
            for (MonHoc xMonHoc:ds_mh) {
                if (MaMonHoc.compareTo(xMonHoc.getMaMonHoc())==0) {
                    TenMonThi = xMonHoc.getTenMonThi();
                    break;
                }
            }
            
            LichThi lt = new LichThi (MaCaThi, NgayThi, GioThi, PhongThi, TenMonThi, Nhom, SoSinhVien );
            ds_lt.add(lt);
        }
        
        Collections.sort(ds_lt);
        for (LichThi xLichThi:ds_lt) {
            System.out.println(xLichThi);
        }
    }
    
}

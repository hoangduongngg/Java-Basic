package j07036_bangdiem_theolop;

import java.io.*;
import java.util.*;

/**
 *
 * @author hoangduongngg
 */
public class J07036_BangDiem_theoLop {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner (new File("SINHVIEN.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> dssv = new ArrayList<>();
        while (t-->0) {
            dssv.add(new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        in = new Scanner (new File("MONHOC.in"));
        t = Integer.parseInt(in.nextLine());
        ArrayList<MonHoc> dsmh = new ArrayList<>();
        while (t-->0) {
            dsmh.add(new MonHoc(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        
        in = new Scanner (new File("BANGDIEM.in"));
        t = Integer.parseInt(in.nextLine());
        ArrayList<BangDiem> dsbd = new ArrayList<>();
        while (t-->0) {
            String[] str = in.nextLine().split(" ");
            SinhVien sinhVien = new SinhVien();
            MonHoc monHoc = new MonHoc();
            
            for (SinhVien sv:dssv) {
                if (str[0].compareTo(sv.getMaSV())==0) {
                    sinhVien = sv;
                    break;
                }
            }
            for (MonHoc mh:dsmh) {
                if (str[1].compareTo(mh.getMaMH())==0) {
                    monHoc = mh;
                    break;
                }
            }
            dsbd.add(new BangDiem(sinhVien, monHoc, str[2]));
        }
        Collections.sort(dsbd);
        t = Integer.parseInt(in.nextLine());
        while (t-->0) {
            String LopString = in.nextLine();
            System.out.println("BANG DIEM lop " + LopString + ":");
            for (BangDiem bd:dsbd) {
                if (LopString.compareTo(bd.getLopSV())==0) {
                    System.out.println(bd);
                }
            }
        }
    }
}

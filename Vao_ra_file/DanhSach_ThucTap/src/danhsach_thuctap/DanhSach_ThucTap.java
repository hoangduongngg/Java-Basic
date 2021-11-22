package danhsach_thuctap;

import java.util.*;
import java.io.*;
/**
 *
 * @author hoangduongngg
 */
public class DanhSach_ThucTap {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inSV = new Scanner(new File ("SINHVIEN.in"));
        Scanner inDN = new Scanner(new File ("DN.in"));
        Scanner inTT = new Scanner(new File ("THUCTAP.in"));
        
        Integer t1 = Integer.parseInt(inSV.nextLine());
        HashMap <String, SinhVien> mapSV = new HashMap<>();
        while (t1-->0) {
            SinhVien dn = new SinhVien( inSV.nextLine(), inSV.nextLine(), inSV.nextLine(), inSV.nextLine());
            mapSV.put(dn.getMa(), dn);
        }
        
        Integer t2 = Integer.parseInt(inDN.nextLine());
        HashMap <String, DoanhNghiep> mapDN = new HashMap<>();
        while (t2-->0) {
            DoanhNghiep dn = new DoanhNghiep(inDN.nextLine(), inDN.nextLine(), inDN.nextLine());
            mapDN.put(dn.getMa(), dn);
        }

        
        Integer t3 = Integer.parseInt(inTT.nextLine());
        HashMap <String, String> mapTT = new HashMap<>();
        while (t3-->0) {
            ThucTap tt = new ThucTap(inTT.nextLine());
            mapTT.put(tt.getMaDN(), tt.getMaSV());
        }

        int SoDN = Integer.parseInt(inTT.nextLine());
        while (SoDN-->0) {
            String MaDN = inTT.nextLine();
            DoanhNghiep dn = mapDN.get(MaDN);
            System.out.println("DANH SACH THUC TAP TAI " + dn.getTen() + ":");
            String MaSV =  mapTT.get(MaDN);
            SinhVien sv = mapSV.get(MaSV);
            System.out.println(sv);
        }
        
    }
}
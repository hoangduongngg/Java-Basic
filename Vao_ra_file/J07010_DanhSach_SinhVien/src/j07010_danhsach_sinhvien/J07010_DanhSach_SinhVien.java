package j07010_danhsach_sinhvien;

import java.io.*;
import java.util.*;
/**
 *
 * @author hoangduongngg
 */
public class J07010_DanhSach_SinhVien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("SV.in"));
        Integer t = Integer.parseInt(in.nextLine());
        Integer stt = 0;
        while (t-->0) {
            stt++;
            SinhVien sv = new SinhVien (stt, in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            System.out.println(sv);
        }
    }
}

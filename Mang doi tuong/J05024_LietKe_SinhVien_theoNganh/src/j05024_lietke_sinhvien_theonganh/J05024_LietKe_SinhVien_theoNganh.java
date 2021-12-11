package j05024_lietke_sinhvien_theonganh;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J05024_LietKe_SinhVien_theoNganh {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <SinhVien> ds = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while (t-->0) {
            SinhVien sv = new SinhVien (in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            ds.add(sv);
        }
        
        ArrayList <String> ds_nganh = new ArrayList<>();
        int q = Integer.parseInt(in.nextLine());
        while (q-->0) {
            String nganh = in.nextLine().toUpperCase();
            ds_nganh.add(nganh);
        }
        
        for (String nganhString:ds_nganh) {
            System.out.println("DANH SACH SINH VIEN NGANH " + nganhString + ":");
            for (SinhVien x:ds) {
                if (x.getNganh().compareTo(rutgon(nganhString))==0) {
                    System.out.println(x);
                }
            }
        }
    }
    
    public static String rutgon (String nganhString) {
        String[] nganhlist = nganhString.split(" ");
        return "" + nganhlist[0].charAt(0) + nganhlist[1].charAt(0);
    }
}

//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//E15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//E15CQKT02-B
//sv4@stu.ptit.edu.vn
//2
//Ke toan
//Cong nghe thong tin
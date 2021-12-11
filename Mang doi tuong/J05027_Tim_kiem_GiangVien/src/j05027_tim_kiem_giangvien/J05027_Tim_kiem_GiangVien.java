/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05027_tim_kiem_giangvien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J05027_Tim_kiem_GiangVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<GiangVien> ds_gv = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        int stt = 0;
        while (t-->0) {
            stt++;
            GiangVien gv = new GiangVien (stt, in.nextLine(), in.nextLine());
            ds_gv.add(gv);
        }
        
        ArrayList <String> ds_keyword = new ArrayList<>();
        int Q = Integer.parseInt(in.nextLine());
        while (Q-->0) {
            ds_keyword.add(in.nextLine());
        }
        for (String KeyWord:ds_keyword) {
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + KeyWord + ":");
            for (GiangVien xObject:ds_gv) {
                if (TimKiem(KeyWord, xObject.getTen())) {
                    System.out.println(xObject);
                }
            }
        }
    }
    
    public static boolean TimKiem (String KeyWord, String Word) {
        Word = Word.toLowerCase();
        KeyWord = KeyWord.toLowerCase();
        if (Word.contains(KeyWord)) return true;
        return false;
    }
    
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//1
//aN
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05034_danhsach_thuctap_1;

/**
 *
 * @author hoangduongngg
 */
import java.util.*;
public class J05034_DanhSach_ThucTap_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        int stt = 0;
        ArrayList<SinhVien> dssv = new ArrayList<>();
        
        while (t-->0) {
            stt++;
            dssv.add(new SinhVien(stt, in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(), in.nextLine() ));
        }
        
        Collections.sort(dssv);
        
        t=Integer.parseInt(in.nextLine());
        while(t-->0) {
            String DoanhNghiep = in.nextLine();
            for (SinhVien x:dssv) {
                if (DoanhNghiep.compareTo(x.getDoanhNghiep())==0) {
                    System.out.println(x);
                }
            }
        }
        
        
    }
    
}

//6
//B17DCCN016 
//Le Khac Tuan Anh 
//D17HTTT2   
//test1@stu.ptit.edu.vn
//VIETTEL
//B17DCCN107 
//Dao Thanh Dat    
//D17CNPM5   
//test2@stu.ptit.edu.vn
//FPT
//B17DCAT092 
//Cao Danh Huy     
//D17CQAT04-B
//test3@stu.ptit.edu.vn
//FPT
//B17DCCN388 
//Cao Sy Hai Long  
//D17CNPM2   
//test4@stu.ptit.edu.vn
//VNPT
//B17DCCN461 
//Dinh Quang Nghia 
//D17CNPM2   
//test5@stu.ptit.edu.vn
//FPT
//B17DCCN554 
//Bui Xuan Thai    
//D17CNPM1   
//test6@stu.ptit.edu.vn
//GAMELOFT
//1
//FPT
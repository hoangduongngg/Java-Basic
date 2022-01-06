
package j05014_tuyen_giaovien;

import java.util.*;

/**
 *
 * @author hoangduongngg
 */
public class J05014_Tuyen_GiaoVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<GiaoVien> dsgv = new ArrayList<>();
        int stt = 0;
        while (t-->0) {
            stt++;
            dsgv.add(new GiaoVien(stt, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        
        Collections.sort(dsgv);
        for (GiaoVien gv:dsgv) {
            System.out.println(gv);
        }
    }
    
}
//3
//Le Van Binh
//A1
//7.0
//3.0
//Tran Van Toan
//B3
//4.0
//7.0
//Hoang Thi Tam
//C2
//7.0
//6.0
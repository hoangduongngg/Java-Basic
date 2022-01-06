package j05079_lophocphan_1;

import java.util.*;

/**
 *
 * @author hoangduongngg
 */
public class J05079_LopHocPhan_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        ArrayList<MonHoc> dsmh = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while (t -->0) {
            dsmh.add(new MonHoc(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        
        Collections.sort(dsmh);
        t = Integer.parseInt(in.nextLine());
        while (t -->0) {
            String monHocString = in.nextLine();
            int flag = 0; //Dung de danh dau in tieu de hay chua?
            for (MonHoc mh:dsmh) {
                if (monHocString.compareTo(mh.getMaMH())==0) {
                    if (flag==0) {
                        System.out.println("Danh sach nhom lop mon " + mh.getTenMH() + ":");
                        flag = 1;
                    }
                    System.out.println(mh);
                }
            }
            
        }
    }
    
}
//4
//THCS2D20
//Tin hoc co so 2 - D20
//01
//Nguyen Binh An
//CPPD20
//Ngon ngu lap trinh C++ - D20
//01
//Le Van Cong
//THCS2D20
//Tin hoc co so 2 - D20
//02
//Nguyen Trung Binh
//LTHDTD19
//Lap trinh huong doi tuong - D19
//01
//Nguyen Binh An
//1
//THCS2D20
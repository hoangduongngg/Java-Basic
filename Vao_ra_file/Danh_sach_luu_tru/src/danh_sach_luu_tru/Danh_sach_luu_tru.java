package danh_sach_luu_tru;

import java.io.*;
import java.util.*;

/**
 *
 * @author hoangduongngg
 */
public class Danh_sach_luu_tru {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner (new File("KHACH.in"));
        List <KhachHang> ds = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        int stt = 1;
        while (t-->0) {
            KhachHang KH = new KhachHang(stt,in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            stt++;
            
            ds.add(KH);
        }
        Collections.sort(ds);
        for (KhachHang x:ds) {
            System.out.println(x);
        }
    }
}

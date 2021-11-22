package danh_sach_san_pham_2;

import java.util.*;
import java.io.*;

/**
 *
 * @author hoangduongngg
 */
public class Danh_sach_san_pham_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner (new File("SANPHAM.in"));
        List <SanPham> ds = new ArrayList<>();
        int t = Integer.parseInt(in.nextLine());
        while (t-->0) {
            SanPham sp = new SanPham (in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            ds.add(sp);
        }
        Collections.sort(ds);
        for (Object x:ds) {
            System.out.println(x);
        }
    }
}

package danh_sach_mon_hoc;

import java.io.*;
import java.util.*;

public class Danh_sach_mon_hoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(in.nextLine());
        HashMap <String, MonHoc> map = new HashMap<>();
        while (t-->0) {
            MonHoc mh = new MonHoc(in.nextLine(), in.nextLine(), in.nextLine());
            map.put(mh.getName(), mh);
        }
        xuly(map);
    }
    public static void xuly( HashMap <String, MonHoc> map) {
        List keys = new ArrayList(map.keySet());
        Collections.sort(keys);
        for (Object x:keys) {
            System.out.println(map.get(x));
        }
    }
}
